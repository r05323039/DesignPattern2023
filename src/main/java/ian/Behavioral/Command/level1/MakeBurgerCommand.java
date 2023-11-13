package ian.Behavioral.Command.level1;

class MakeBurgerCommand implements OrderCommand {
    private Cook cook;

    public MakeBurgerCommand(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.makeBurger();
    }
}
