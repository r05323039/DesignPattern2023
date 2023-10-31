package ian.Creational.AbstractFactory;

import ian.Creational.SimpleFactory.goodMeal.Meat;
import ian.Creational.SimpleFactory.goodMeal.Pork;
import ian.Creational.SimpleFactory.goodMeal.Turkey;

public class KFC extends AbsRestaurant {
    Meat createMeat(String type) {//定義取餐方法 : 本店生產Pork,Turkey
        Meat meal = null;
        if ("Pork".equals(type)) {
            meal = new Pork();
        } else if ("Turkey".equals(type)) {
            meal = new Turkey();
        }
        return meal;
    }

    Sauce getSauce() { //定義取醬方法 : 提供辣椒醬
        return new HotSauce();
    }

    public static void main(String[] args) {
        KFC kfc = new KFC();
        kfc.cookMeat("Pork");
    }
}
