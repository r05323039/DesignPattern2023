package ian.Creational.SimpleFactory.FactoryMethod;

import ian.Creational.SimpleFactory.goodMeal.Meat;
import ian.Creational.SimpleFactory.goodMeal.Pork;

public class PorkFactory implements MeatFactory2 {
    public Meat createMeat() {
        return new Pork();
    }
}
