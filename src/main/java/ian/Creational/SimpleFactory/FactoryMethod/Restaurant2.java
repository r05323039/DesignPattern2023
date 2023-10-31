package ian.Creational.SimpleFactory.FactoryMethod;

import ian.Creational.SimpleFactory.goodMeal.Meat;

public class Restaurant2 {
    private MeatFactory2 factory;// 工廠也變成介面，可解決項目增加，違反開放封閉問題

    public Restaurant2(MeatFactory2 factory){
        this.factory = factory;
    }


    public Meat cookMeat(){ //meat實作由factory決定，不需要吃meatType參數
        Meat meat = factory.createMeat();

        meat.cook();
        meat.delivery();

        return meat;
    }

    public static void main(String[] args) {
        Restaurant2 restaurant2 = new Restaurant2(new TurkeyFactory());
        restaurant2.cookMeat();
    }
}
