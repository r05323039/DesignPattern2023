package ian.Behavioral.ChainOfResponsibility.level1_modified;

interface PurchasingHandler {
    void setNextHandler(PurchasingHandler handler);

    boolean approvePurchase(int amount);
}
