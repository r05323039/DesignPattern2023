package ian.Creational.AbstractFactory.level1;

class FurnitureFactoryInJapan implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ChairFromJapan();
    }

    @Override
    public Table createTable() {
        return new TableFromJapan();
    }
}
