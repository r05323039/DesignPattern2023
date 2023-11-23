package ian.Behavioral.Visitor.level2;

interface DiscountVisitor {
    void visit(Book book);
    void visit(Electronics electronics);
}
