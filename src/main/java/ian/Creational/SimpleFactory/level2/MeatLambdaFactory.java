package ian.Creational.SimpleFactory.level2;

import ian.Creational.SimpleFactory.level1.goodMeal.Meat;
import ian.Creational.SimpleFactory.level1.goodMeal.Pork;


import java.util.function.Supplier;

class MeatLambdaFactory {
    Meat create_bad(Supplier<Meat> supplier) {
        return supplier.get();
    }
    // 上述只會返回Meat。改良為下面的，會直接返回T，不需要再呼叫後轉型，相對更靈活
    <T extends Meat> T create(Supplier<T> supplier) {
        return supplier.get();
    }

    // 一樣能編譯檢查，是否有實作Meat
    public static void main(String[] args) {
        MeatLambdaFactory factory = new MeatLambdaFactory();
        Meat pork = factory.create(Pork::new);
        Meat pork2 = factory.create(Pork::new);
        // 也能吃建造者模式
        System.out.println(pork == pork2);
    }
}
