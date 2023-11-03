package ian.Creational.SimpleFactory.level2;

import ian.Creational.SimpleFactory.level1.goodMeal.Meat;
import ian.Creational.SimpleFactory.level1.goodMeal.Pork;

class MeatClassTypeFactory {

    public Meat createMeat_bad(Class<Meat> meatType) {
        try {
            return meatType.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalArgumentException("Unknown enemy type: " + meatType);
        }
    }// 上述只會返回Meat。改良為下面的，會直接返回T，不需要再呼叫後轉型，相對更靈活
    // 反射是走後門，盡量少用

    public <T extends Meat> T createMeat(Class<T> meatType) {
        try {
            return meatType.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalArgumentException("Unknown enemy type: " + meatType);
        }
    }

    // 只有 implement Meat的class可以當參數，並透過.class的newInstance()來創建
    // 缺點是處理兩種例外，但沒有增加if else 違反開放封閉原則
    public static void main(String[] args) {
        MeatClassTypeFactory factory = new MeatClassTypeFactory();
        Meat pork = factory.createMeat(Pork.class);
        Meat pork2 = factory.createMeat(Pork.class);
        System.out.println(pork == pork2);

    }
}
