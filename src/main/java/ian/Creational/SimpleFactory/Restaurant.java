package ian.Creational.SimpleFactory;

import ian.Creational.SimpleFactory.FactoryMethod.PorkFactory;
import ian.Creational.SimpleFactory.badMeal.Chicken;
import ian.Creational.SimpleFactory.badMeal.Steak;
import ian.Creational.SimpleFactory.goodMeal.Meat;
import ian.Creational.SimpleFactory.goodMeal.Pork;
import ian.Creational.SimpleFactory.goodMeal.Turkey;

public class Restaurant {
    public Steak cookSteak() {
        Steak steak = new Steak();
        steak.cook();
        steak.delivery();
        return steak;
    }

    public Chicken cookChicken() {
        Chicken chicken = new Chicken();
        chicken.cook();//重複
        chicken.delivery();//重複
        return chicken;
    }// 增加餐點導致 method 複雜度上升

    // 統一實作Meat
    public Meat cookMeatBad(String meatType) {
        Meat meat = null;
        if ("Pork".equals(meatType)) {
            meat = new Pork();
        } else if ("Turkey".equals(meatType)) {
            meat = new Turkey();
        }// 1.增加餐點添加else if，違反開放封閉

        meat.cook();
        meat.delivery();
        return meat;
        // 2.生產meat + 處理meat，違反單一職責
    }
    // 加入工廠
    private MeatFactory factory;

    public Meat cookMeatGood(String meatType){
        // 生產邏輯委外給factory
        Meat meat = factory.createMeat(meatType);
        // 負責meat的處理，也符合方法名稱cookMeat，符合單一職責
        meat.cook();
        meat.delivery();

        return meat;
    }


    // 實際演練

    public Restaurant(MeatFactory factory) {
        this.factory = factory;
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(new MeatFactory());
        restaurant.cookMeatGood("Turkey");// type可用Enum規範，才不會吃空指針例外
    }
}
