package ian.Behavioral.Command.level1;

class MakeDrinkCommand implements OrderCommand {
    private Cook cook;

    public MakeDrinkCommand(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.makeDrink();
    }
}
