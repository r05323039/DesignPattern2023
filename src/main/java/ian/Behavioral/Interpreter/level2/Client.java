package ian.Behavioral.Interpreter.level2;

class Client {
    public static void main(String[] args) {
        Expression isMale = new OrExpression(new VariableExpression("John"), new VariableExpression("Mike"));
        Expression isMarriedWoman = new AndExpression(new VariableExpression("Married"), new VariableExpression("Julie"));

        String context = "John Mike Married Julie";
        System.out.println("John is male? " + isMale.interpret(context));
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret(context));
    }
}
