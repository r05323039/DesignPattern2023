package ian.Behavioral.ChainOfResponsibility.level1;

abstract class Staff implements PurchasingHandler {
    protected String name;
    protected PurchasingHandler next;

    public Staff(String name) {
        this.name = name;
    }

    @Override
    public boolean approvePurchase(int amount) {
        return false;//需實作
    }

    @Override
    public void setNextHandler(PurchasingHandler handler) {
        this.next = handler;
    }
}
