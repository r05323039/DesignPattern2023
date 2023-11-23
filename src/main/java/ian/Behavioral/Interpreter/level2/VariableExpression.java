package ian.Behavioral.Interpreter.level2;

class VariableExpression implements Expression {
    private String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(name);
    }
}
