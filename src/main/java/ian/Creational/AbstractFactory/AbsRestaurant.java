package ian.Creational.AbstractFactory;

import ian.Creational.SimpleFactory.goodMeal.Meat;

public abstract class AbsRestaurant {
    // 工廠方法是針對一種物件在做處理。
    // 取得多個物件使用抽象工廠 AbstractFactory
    // 透過 abstract，組合單一工廠 / 工廠方法 ，再由子類實作

    public Meat cookMeat(String type) { //每個餐廳要做的事情
        Meat meat = createMeat(type);
        Sauce ingredient = getSauce();

        meat.cook();
        ingredient.getSauce();
        return meat;
    }

    abstract Meat createMeat(String type); // 自行實作如何取得Meat
    // 方法簽名有參數type，使用單一工廠，管理所有肉類 ，可依需求改成工廠方法

    abstract Sauce getSauce(); // 自行實作如何取得醬料
    // 第二個原料為醬料，以工廠方法取得 ，也可以改成單一工廠
}
