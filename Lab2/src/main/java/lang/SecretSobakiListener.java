package lang;

import grammer.secretSobakiBaseListener;
import grammer.secretSobakiParser;
import lang.VarType.Type;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SecretSobakiListener extends secretSobakiBaseListener {

    private final MethodVisitor visitor;
    private final Map<String, Type> types;
    private final Map<String, Integer> ids;
    private final LinkedList<Label> flows;
    private final Map<String, Label> labels;
    private int varId = 0;

    public SecretSobakiListener(MethodVisitor visitor) {
        this.visitor = visitor;
        types = new HashMap<>();
        ids = new HashMap<>();
        flows = new LinkedList<>();
        labels = new HashMap<>();
    }

    public void declare(String var, Type type) {
        if(types.containsKey(var)){
            System.out.println("Variable is re-declared. It is " + var);
        }
        types.put(var, type);
        ids.put(var, varId);
        varId++;
    }

    @Override
    public void exitVarDeclaration(secretSobakiParser.VarDeclarationContext ctx) {
        String var = ctx.VarName().getText();
        Type type = ctx.type().Int() == null ? Type.STRING : Type.INT;
        declare(var, type);
    }

    @Override
    public void exitIntVarDeclaration(secretSobakiParser.IntVarDeclarationContext ctx) {
        String var = ctx.VarName().getText();
        declare(var, Type.INT);
        assignInt(ids.get(var), ctx.intRightValue());
    }

    @Override
    public void exitStrVarDeclaration(secretSobakiParser.StrVarDeclarationContext ctx) {
        String var = ctx.VarName().getText();
        declare(var, Type.STRING);
        assignStr(ids.get(var), ctx.strRightValue());
    }

    private void assignInt(int id, secretSobakiParser.IntRightValueContext context) {
        if (context.Num() != null) {
            int val = Integer.parseInt(context.Num().getText());
            visitor.visitLdcInsn(val);
            visitor.visitVarInsn(Opcodes.ISTORE, id);
        }
        else{
            String var = context.VarName().getText();
            if(!types.containsKey(var)){
                System.out.println("Variable was not declared. It is " + var);
            }
            visitor.visitVarInsn(Opcodes.ILOAD, ids.get(var));
            visitor.visitIntInsn(Opcodes.ISTORE, id);
        }
    }

    public void assignStr(int id, secretSobakiParser.StrRightValueContext context) {
        if(context.StringValue() != null) {
            String value = context.StringValue().getText().replace("\"", "");
            visitor.visitLdcInsn(value);
            visitor.visitVarInsn(Opcodes.ASTORE, id);
        } else {
            String var = context.VarName().getText();
            if(!types.containsKey(var)){
                System.out.println("Variable was not declared. It is " + var);
            }
            visitor.visitVarInsn(Opcodes.ALOAD, ids.get(var));
            visitor.visitIntInsn(Opcodes.ASTORE, id);
        }
    }

    @Override
    public void exitIntVarAssign(secretSobakiParser.IntVarAssignContext ctx) {
        String var = ctx.VarName().getText();
        assignInt(ids.get(var), ctx.intRightValue());
    }

    @Override
    public void exitStrVarAssign(secretSobakiParser.StrVarAssignContext ctx) {
        String var = ctx.VarName().getText();
        assignStr(ids.get(var), ctx.strRightValue());
    }

    @Override
    public void exitCompareInt(secretSobakiParser.CompareIntContext ctx) {
        int countOfValues = ctx.intRightValue().size();
        for(int i = 0; i < countOfValues; i++) {
            secretSobakiParser.IntRightValueContext value = ctx.intRightValue().get(i);
            if (value.VarName() != null){
                String var = value.VarName().getText();
                if(!types.containsKey(var)){
                    System.out.println("Variable was not declared. It is " + var);
                }
                visitor.visitVarInsn(Opcodes.ILOAD, ids.get(var));
            }
            else{
                visitor.visitLdcInsn(Integer.parseInt(value.Num().getText()));
            }
        }

        Label label = new Label();

        Object notRef = ctx.parent instanceof secretSobakiParser.ConditionContext ?
                ((secretSobakiParser.ConditionContext) ctx.parent).not() :
                ((secretSobakiParser.LoopContext) ctx.parent).not();

        if (notRef == null) {
            switch (ctx.compareOperation().getText()){
                case "<":
                    visitor.visitJumpInsn(Opcodes.IF_ICMPGE, label);
                    break;
                case ">":
                    visitor.visitJumpInsn(Opcodes.IF_ICMPLE, label);
                    break;
                case "==":
                    visitor.visitJumpInsn(Opcodes.IF_ICMPNE, label);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation " + ctx.compareOperation().getText());
            }

        } else {
            switch (ctx.compareOperation().getText()){
                case "<":
                    visitor.visitJumpInsn(Opcodes.IF_ICMPLE, label);
                    break;
                case ">":
                    visitor.visitJumpInsn(Opcodes.IF_ICMPGE, label);
                    break;
                case "==":
                    visitor.visitJumpInsn(Opcodes.IF_ICMPEQ, label);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation with not " + ctx.compareOperation().getText());
            }
        }

        flows.add(label);
    }

    @Override
    public void exitCompareStr(secretSobakiParser.CompareStrContext ctx) {
        int countOfValues = ctx.strRightValue().size();
        for(int i = 0; i < countOfValues; i++) {
            secretSobakiParser.StrRightValueContext value = ctx.strRightValue().get(i);
            if (value.VarName() != null){
                String var = value.VarName().getText();
                if(!types.containsKey(var)){
                    System.out.println("Variable was not declared. It is " + var);
                }
                visitor.visitVarInsn(Opcodes.ALOAD, ids.get(var));
            }
            else{
                String str = value.StringValue().getText().replace("\"", "");
                visitor.visitLdcInsn(str);
            }

        }

        visitor.visitMethodInsn(
                Opcodes.INVOKEVIRTUAL,
                "java/lang/String",
                "compareTo",
                "(Ljava/lang/String;)I",
                false);

        Label label = new Label();
        visitor.visitLdcInsn(0);

        Object notRef = ctx.parent instanceof secretSobakiParser.ConditionContext ?
                ((secretSobakiParser.ConditionContext) ctx.parent).not() :
                ((secretSobakiParser.LoopContext) ctx.parent).not();

        if (notRef == null) {
            switch (ctx.compareOperation().getText()){
                case "<":
                    visitor.visitJumpInsn(Opcodes.IF_ICMPGE, label);
                    break;
                case ">":
                    visitor.visitJumpInsn(Opcodes.IF_ICMPLE, label);
                    break;
                case "==":
                    visitor.visitJumpInsn(Opcodes.IF_ICMPNE, label);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation " + ctx.compareOperation().getText());
            }

        } else {
            switch (ctx.compareOperation().getText()){
                case "<":
                    visitor.visitJumpInsn(Opcodes.IF_ICMPLE, label);
                    break;
                case ">":
                    visitor.visitJumpInsn(Opcodes.IF_ICMPGE, label);
                    break;
                case "==":
                    visitor.visitJumpInsn(Opcodes.IF_ICMPEQ, label);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation with not " + ctx.compareOperation().getText());
            }
        }

        flows.add(label);
    }

    @Override
    public void exitIfStatement(secretSobakiParser.IfStatementContext ctx) {
        visitor.visitLabel(flows.pollLast());
    }

    @Override
    public void exitPrint(secretSobakiParser.PrintContext ctx) {
        visitor.visitFieldInsn(
                Opcodes.GETSTATIC,
                "java/lang/System",
                "out",
                "Ljava/io/PrintStream;"
        );
        String description = "(I)V";
        if (ctx.Num() != null){
            visitor.visitLdcInsn(Integer.parseInt(ctx.Num().getText()));
        }
        else if (ctx.StringValue() != null){
            visitor.visitLdcInsn(ctx.StringValue().getText().replace("\"", ""));
            description = "(Ljava/lang/String;)V";
        }
        else{
            String var = ctx.VarName().getText();
            if(!types.containsKey(var)){
                System.out.println("Variable was not declared. It is " + var);
            }

            if(types.get(var) == Type.INT){
                visitor.visitVarInsn(Opcodes.ILOAD, ids.get(var));
            } else{
                visitor.visitVarInsn(Opcodes.ALOAD, ids.get(var));
                description = "(Ljava/lang/String;)V";
            }
        }
        visitor.visitMethodInsn(
                Opcodes.INVOKEVIRTUAL,
                "java/io/PrintStream",
                "println",
                description,
                false
        );
    }

    @Override
    public void exitGotoOperation(secretSobakiParser.GotoOperationContext ctx) {
        String labelName = ctx.VarName().getText();
        if (!labels.containsKey(labelName)){
            throw new IllegalArgumentException("Label name cannot be found: " + labelName);
        }
        visitor.visitJumpInsn(Opcodes.GOTO, labels.get(labelName));
    }

    @Override
    public void exitIncrement(secretSobakiParser.IncrementContext ctx) {
        String var = ctx.VarName().getText();
        if(!types.containsKey(var)){
            System.out.println("Variable was not declared. It is " + var);
        }
        visitor.visitIincInsn(ids.get(var), 1);
    }

    @Override
    public void enterLoop(secretSobakiParser.LoopContext ctx) {
        Label label = new Label();
        visitor.visitLabel(label);
        flows.add(label);
    }

    @Override
    public void exitLoop(secretSobakiParser.LoopContext ctx) {
        visitor.visitLabel(flows.pollLast());
    }

    @Override
    public void exitGotoLabel(secretSobakiParser.GotoLabelContext ctx) {
        String labelName = ctx.VarName().getText();
        labels.putIfAbsent(labelName, new Label());
        visitor.visitLabel(labels.get(labelName));
    }

    @Override
    public void exitCodeBlock(secretSobakiParser.CodeBlockContext ctx) {
        if (ctx.parent instanceof secretSobakiParser.LoopContext) {
            Label ifStatementLabel = flows.pollLast();
            Label loopLabel = flows.pollLast();
            visitor.visitJumpInsn(Opcodes.GOTO, loopLabel);
            flows.add(ifStatementLabel);
        }
    }
}
