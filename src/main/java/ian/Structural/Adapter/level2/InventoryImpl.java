package ian.Structural.Adapter.level2;

import ian.Creational.SimpleFactory.level1.MeatFactory;

import java.util.List;

public class InventoryImpl implements Inventory{
    @Override
    public List<Product> getAvailableProducts() {
        return null;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        MeatFactory meatFactory = MeatFactory.class.newInstance();;
    }
}
