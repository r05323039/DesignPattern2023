package ian.Structural.Facade.level1;

public class Client {
    public static void main(String[] args) {
        TvFacade controller = new TvFacade(new Tv(), new ElectricSystem());
        controller.turnOn();
        controller.up();
        controller.down();
        System.out.println("=== turn off ===");
        controller.turnOff();
    }
}
