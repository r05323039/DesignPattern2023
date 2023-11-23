package ian.Behavioral.Visitor.level1;

interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);// 開後門讓實現ComputerPartVisitor的物件訪問
}
