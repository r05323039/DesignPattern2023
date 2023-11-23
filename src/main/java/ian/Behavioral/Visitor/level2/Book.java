package ian.Behavioral.Visitor.level2;

class Book implements Commodity {

    private double price;
    private String isbn;

    public Book(double cost, String isbn) {
        this.price = cost;
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void accept(DiscountVisitor visitor) {
        visitor.visit(this);
    }
}
