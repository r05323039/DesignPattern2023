package ian.Creational.AbstractFactory.level1;

class ChairFromJapan implements Chair {
    @Override
    public void create() {
        System.out.println("Create a japanese chair");
    }
}
