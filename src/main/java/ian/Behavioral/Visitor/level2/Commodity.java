package ian.Behavioral.Visitor.level2;

interface Commodity {
    void accept(DiscountVisitor visitor);
}
