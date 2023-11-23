package ian.Behavioral.Visitor.level2;

class Electronics implements Commodity{
    private double price;
    private String brand;

    public Electronics(double cost, String brand) {
        this.price = cost;
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void accept(DiscountVisitor visitor) {
        visitor.visit(this);
    }
}
