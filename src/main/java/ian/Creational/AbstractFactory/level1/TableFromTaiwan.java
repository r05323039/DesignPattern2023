package ian.Creational.AbstractFactory.level1;

class TableFromTaiwan implements Table {
    @Override
    public void create() {
        System.out.println("Create a MIT table");
    }
}
