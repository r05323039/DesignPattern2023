package ian.Creational.AbstractFactory.level1;

class TableFromJapan implements Table {
    @Override
    public void create() {
        System.out.println("Create a japanese table");
    }
}
