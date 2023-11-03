package ian.Creational.AbstractFactory.level1;

class FurnitureFactoryInTaiwan implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ChairFromTaiwan();
    }

    @Override
    public Table createTable() {
        return new TableFromTaiwan();
    }
}
