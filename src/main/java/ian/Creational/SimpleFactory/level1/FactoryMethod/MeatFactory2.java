package ian.Creational.SimpleFactory.level1.FactoryMethod;

import ian.Creational.SimpleFactory.level1.goodMeal.Meat;

public interface MeatFactory2 {
  Meat createMeat();
  // 缺點 : 每增加一種Meat，需要建一個class
  // 如果需求是 Meat + sauce
}
