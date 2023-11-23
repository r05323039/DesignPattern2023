package ian.Behavioral.Visitor.level2;

class DiscountVisitorImpl implements DiscountVisitor {
    @Override
    public void visit(Book book) {
        double discountPrice = book.getPrice() * 0.8;
        System.out.println("Book ISBN::" + book.getIsbn() + ", price after 20% discount:" + discountPrice);
    }

    @Override
    public void visit(Electronics electronics) {
        double discountPrice = electronics.getPrice() * 0.5;
        System.out.println("Electronics Brand::" + electronics.getBrand() + ", price after 50% discount:" + discountPrice);
    }
}
