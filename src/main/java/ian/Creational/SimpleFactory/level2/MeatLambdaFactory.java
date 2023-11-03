package ian.Creational.SimpleFactory.level2;

import ian.Creational.SimpleFactory.level1.goodMeal.Meat;
import ian.Creational.SimpleFactory.level1.goodMeal.Pork;


import java.util.function.Supplier;
 class MeatLambdaFactory {
    public Meat createEnemy(Supplier<Meat> enemySupplier) {
        return enemySupplier.get();
    }

    // 一樣能編譯檢查，是否有實作Meat
    public static void main(String[] args) {
        MeatLambdaFactory factory = new MeatLambdaFactory();
        Meat pork = factory.createEnemy(() -> new Pork());
        Meat pork2 = factory.createEnemy(() -> new Pork());
        System.out.println(pork == pork2);
    }
}
