package ian.Behavioral.Interpreter.level1;

class MinusExpression implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public MinusExpression(Expression left, Expression right) {
        this.leftOperand = left;
        this.rightOperand = right;
    }

    @Override
    public int interpret(Context context) {
        return leftOperand.interpret(context) - rightOperand.interpret(context);
    }
}