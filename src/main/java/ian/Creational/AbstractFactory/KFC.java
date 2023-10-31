package ian.Creational.AbstractFactory;

import ian.Creational.SimpleFactory.FactoryMethod.MeatFactory2;
import ian.Creational.SimpleFactory.FactoryMethod.PorkFactory;
import ian.Creational.SimpleFactory.goodMeal.Meat;

public class KFC extends AbsRestaurant {
    private MeatFactory2 factory2;

    public KFC(MeatFactory2 factory2) {
        this.factory2 = factory2;
    }

    @Override
    Meat createMeat() {
        return factory2.createMeat();
    }

    @Override
    Sauce createSauce(String type) {
        if (type.equals("Hot")) {
            return new HotSauce();
        } else if (type.equals("Soy")) {
            return new SoySauce();
        } else throw new RuntimeException("沒有這種醬料");
    }





    public static void main(String[] args) {
        KFC kfc = new KFC(new PorkFactory());
        kfc.cookMeatWith("Hot");
    }
}
