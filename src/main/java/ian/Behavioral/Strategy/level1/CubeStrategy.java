package ian.Behavioral.Strategy.level1;

class CubeStrategy implements ShapeStrategy {

    private double side;

    public CubeStrategy(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2) * 6;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}
