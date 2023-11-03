package ian.Creational.AbstractFactory;

import ian.Creational.SimpleFactory.level1.goodMeal.Meat;

public abstract class AbsRestaurant {
    // 工廠方法是針對一種物件。
    // 取得多個物件使用抽象工廠 AbstractFactory


    public Meat cookMeatWith(String sauceType) { //每個餐廳要做的事情
        Meat meat = createMeat();
        Sauce sauce = createSauce(sauceType);
        sauce.getSauce();
        meat.cook();
        return meat;
    }

    abstract Meat createMeat(); // 自行實作如何取得

    abstract Sauce createSauce(String type); // 自行實作如何取得

}
