package ian.Behavioral.Visitor.level1;

interface ComputerPartVisitor {
    void visit(Keyboard keyboard);
    void visit(Mouse mouse);
    //實現訪問後要幹嘛，參數為Keyboard，而不是ComputerPart，受訪對象將自己傳入實現方法多載
}
