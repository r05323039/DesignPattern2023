package ian.Behavioral.Strategy.level1;

class Client {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator(new CircleStrategy(3));
        System.out.println(calculator.calculateArea());
        System.out.println(calculator.calculateVolume());

        calculator.setStrategy(new CubeStrategy(4));
        System.out.println(calculator.calculateArea());
        System.out.println(calculator.calculateVolume());
    }
}
