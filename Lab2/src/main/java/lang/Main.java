package lang;


import grammer.secretSobakiLexer;
import grammer.secretSobakiParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    private static final int ARG = 1;
    private static final int VERSION = 52;

    public static ClassWriter createClass (String inputFile, String className) throws IOException {
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        classWriter.visit(
                VERSION,
                Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER,
                className,
                null,
                "java/lang/Object",
                null
        );

        MethodVisitor visitor = classWriter.visitMethod(
                Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
                "main",
                "([Ljava/lang/String;)V",
                null,
                null
        );

        secretSobakiLexer lexer = new secretSobakiLexer(CharStreams.fromFileName(inputFile));
        secretSobakiParser parser = new secretSobakiParser(new CommonTokenStream(lexer));
        parser.addParseListener(new SecretSobakiListener(visitor));
        parser.program();

        visitor.visitInsn(Opcodes.RETURN);
        visitor.visitMaxs(255, 255);
        visitor.visitEnd();
        classWriter.visitEnd();
        return classWriter;
    }

    public static void main(String[] args) {
        if (args.length != ARG) {
            System.out.println("Invalid number of arguments = " + args.length + "." +
                    " Required number of arguments = " + ARG);
            return;
        }

        try {
            String [] arg = args[0].split("\\.");
            String className = arg[0];
            ClassWriter cw = createClass(args[0], className);
            File classFile = new File(className + ".class");
            try (BufferedOutputStream buffer = new BufferedOutputStream(new FileOutputStream(classFile));) {
                byte[] data = cw.toByteArray();
                buffer.write(data, 0, data.length);
                buffer.flush();
            }
        } catch (IOException e) {
            System.out.println("Problems opening a file " + args[0]);
        }
    }
}
