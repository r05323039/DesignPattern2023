package ian.Behavioral.Interpreter.level1;

class Client {
    public static void main(String[] args) {
        // (1 + 2) - 3
        Expression expression = new MinusExpression(
                new PlusExpression(new NumberExpression(2), new NumberExpression(2)),
                new NumberExpression(3)
        );

        Context context = new Context();
        int result = expression.interpret(context);

        System.out.println("Result: " + result);
    }
}
