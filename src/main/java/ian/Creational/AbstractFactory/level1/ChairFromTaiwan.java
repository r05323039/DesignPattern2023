package ian.Creational.AbstractFactory.level1;

class ChairFromTaiwan implements Chair {
    @Override
    public void create() {
        System.out.println("Create a MIT chair");
    }
}
