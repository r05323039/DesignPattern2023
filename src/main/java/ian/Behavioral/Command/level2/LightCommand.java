package ian.Behavioral.Command.level2;

class LightCommand implements Command {
    private Bulb bulb;

    public LightCommand(Bulb appliance) {
        this.bulb = appliance;
    }

    @Override
    public void execute() {
        bulb.on();
    }

    @Override
    public void undo() {
        bulb.off();
    }
}
