package ian.Creational.SimpleFactory.FactoryMethod;

import ian.Creational.SimpleFactory.goodMeal.Meat;
import ian.Creational.SimpleFactory.goodMeal.Turkey;

public class TurkeyFactory implements MeatFactory2 {
    public Meat createMeat() {
        return new Turkey();
    }
}
