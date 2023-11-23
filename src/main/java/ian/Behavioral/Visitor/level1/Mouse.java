package ian.Behavioral.Visitor.level1;

class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);//傳入對象為Mouse，會調用visit(Mouse mouse)的邏輯
    }
}