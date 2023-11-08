package ian.Behavioral.ChainOfResponsibility.level1;

interface PurchasingHandler {
    void setNextHandler(PurchasingHandler handler); // 設定下一個責任者

    boolean approvePurchase(int amount);// 在責任鏈上傳遞的請求
}
