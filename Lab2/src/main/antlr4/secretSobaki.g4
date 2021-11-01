grammar secretSobaki;

Int : 'int' ;
String : 'string' ;
type: Int | String;

VarName : [a-zA-Z][a-zA-Z0-9_]*;
Num : '-'?[0-9]+;
StringValue: '"' (.)*? '"';
intRightValue: VarName | Num;
strRightValue: VarName | StringValue;

WS : [ \n\r\t]+;
varDeclaration: type WS VarName WS? ';' WS?;

intVarDeclaration: Int WS VarName WS? '=' WS? intRightValue WS? ';' WS?;
strVarDeclaration: String WS VarName WS '=' WS strRightValue WS? ';' WS?;

intVarAssign: VarName WS? '=' WS? intRightValue WS? ';' WS?;
strVarAssign: VarName WS? '=' WS? strRightValue WS? ';' WS?;

compareInt: intRightValue WS? compareOperation WS? intRightValue WS?;
compareStr: strRightValue WS? compareOperation WS? strRightValue WS?;

compareOperation: Less | Greater | Equal;
Less: '<';
Greater: '>';
Equal: '==';

not: 'not';

condition: (not)? WS? '(' WS? (compareInt | compareStr) WS? ')' WS?;

ifStatement: 'if' WS (condition) codeBlock WS?;

print : 'print' WS? '('WS? (Num | StringValue | VarName) WS? ')' WS? ';' WS?;
gotoOperation: 'goto' WS VarName WS? ';' WS?;
increment: VarName '++' WS? ';' WS?;
loop: 'while' WS? not? WS? (condition) WS? codeBlock WS?;

sobaki : '@';
gotoLabel: sobaki WS? VarName WS? ';' WS?;

codeBlock: '{' WS? (gotoLabel | gotoOperation | varDeclaration | intVarDeclaration |
    intVarAssign | strVarDeclaration | strVarAssign |
    ifStatement | loop | codeBlock | increment | print)*'}' | EOF;

program: WS? 'mainPrograms' WS? codeBlock;