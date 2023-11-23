package ian.Structural.Bridge.level1;

class Client {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Controller controller = new Controller(tv);
        controller.togglePower();
        controller.togglePower();
        controller.togglePower();
        controller.togglePower();
    }
}
