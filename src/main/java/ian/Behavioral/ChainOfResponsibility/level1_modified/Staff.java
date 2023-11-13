package ian.Behavioral.ChainOfResponsibility.level1_modified;

abstract class Staff implements PurchasingHandler {
    protected String name;
    protected PurchasingHandler next;
    protected int authorizedAmount;// 責任鏈上處理者，實作處理方法時，主要在處理金額權限不同

    public Staff(String name, int maxAmount) {
        this.name = name;
        this.authorizedAmount = maxAmount;
    }

    @Override
    public void setNextHandler(PurchasingHandler handler) {
        this.next = handler;
    }

    @Override
    public boolean approvePurchase(int amount) {
        //modified版本，類別的授權金額提升為成員屬性，把傳遞責任的邏輯，集中在抽象類
        if (amount < authorizedAmount) {
            System.out.println(this.name + "同意採購，金額: " + amount);
            //這邊可以寫成抽象方法，讓各class繼承後，實作處理邏輯 (責任掉到我身上，要做什麼...)
            return true;
        }
        System.out.println(this.name + "無此權限");
        return next.approvePurchase(amount);
    }
//    protected abstract void doPurchase();
//    protected abstract void doPurchase(int amount);
}
