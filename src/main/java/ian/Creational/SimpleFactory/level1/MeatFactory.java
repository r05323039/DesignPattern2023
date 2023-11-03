package ian.Creational.SimpleFactory.level1;

import ian.Creational.SimpleFactory.level1.goodMeal.Meat;
import ian.Creational.SimpleFactory.level1.goodMeal.Pork;
import ian.Creational.SimpleFactory.level1.goodMeal.Turkey;

public class MeatFactory {
    //一個class來負責建立其他class的實例，被建立的通常都具有共同的super class
    public Meat createMeat(String meatType){// 參數決定要建構的物件
        Meat meat = null;
        if ("Pork".equals(meatType)) {
            meat = new Pork();
        } else if ("Turkey".equals(meatType)) {
            meat = new Turkey();
        }
        return meat;
    }
// 缺陷 : 增加種類需要修改else if，違反開放封閉原則，只適用項目不會增加
// 解法 : FactoryMethod，由一個工廠管理所有肉類 -> 每種肉類由一種工廠管理，新增一個工廠代替增加一組if else

}
