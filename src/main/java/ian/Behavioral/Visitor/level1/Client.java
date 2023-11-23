package ian.Behavioral.Visitor.level1;

class Client {
    public static void main(String[] args) {
        ComputerPart keyboard = new Keyboard();
        ComputerPart mouse = new Mouse();

        ComputerPartVisitor repairVisitor = new ComputerPartRepairVisitor();

        keyboard.accept(repairVisitor);
        mouse.accept(repairVisitor);

    }
}
