package ian.Creational.Singleton;

class SuperMarket {
    private int quantity = 100;
    private static SuperMarket instance = new SuperMarket();// static : SuperMarket屬於Class，僅有一個
    private SuperMarket() {// 封鎖建構
    }
    public static SuperMarket getInstance() { // 提供取得instance方法
        return instance;
    }
}
