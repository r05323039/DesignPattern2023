package ian.Creational.Singleton;

public enum Market {
    // 單例模式 : 直接開enum就好
    INSTANCE;
    private int quantity = 100;
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {
        Market market = Market.INSTANCE;
    }
}
