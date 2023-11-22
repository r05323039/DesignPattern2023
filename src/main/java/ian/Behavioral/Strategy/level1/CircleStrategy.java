package ian.Behavioral.Strategy.level1;

class CircleStrategy implements ShapeStrategy {
    private double radius;

    public CircleStrategy(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
