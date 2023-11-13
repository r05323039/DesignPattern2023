package ian.Behavioral.Command.level2;

class Client {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb("bulb1");
        Bulb bulb2 = new Bulb("bulb2");
        Bulb bulb3 = new Bulb("bulb3");

        LightCommand comd1 = new LightCommand(bulb1);
        LightCommand comd2 = new LightCommand(bulb2);
        LightCommand comd3 = new LightCommand(bulb3);

        RemoteControl control = new RemoteControl();
        control.addCommand(0, comd1);
        control.addCommand(1, comd2);
        control.addCommand(2, comd3);

        control.pressOnButton(0);
        control.pressOffButton(0);
        System.out.println("===");
        control.pressOnAll();
        System.out.println("===");
        control.pressOffAll();
    }
}
