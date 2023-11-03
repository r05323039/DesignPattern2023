package ian.Creational.SimpleFactory.level1.FactoryMethod;

import ian.Creational.SimpleFactory.level1.goodMeal.Meat;
import ian.Creational.SimpleFactory.level1.goodMeal.Pork;

public class PorkFactory implements MeatFactory2 {
    public Meat createMeat() {
        return new Pork();
    }
}
