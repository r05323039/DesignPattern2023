package ian.Behavioral.Visitor.level1;

class ComputerPartRepairVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Repairing keyboard.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Repairing mouse.");
    }
}