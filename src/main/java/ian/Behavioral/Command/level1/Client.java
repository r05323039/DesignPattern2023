package ian.Behavioral.Command.level1;

class Client {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Waiter waiter = new Waiter();
        //客戶點餐
        OrderCommand burgerOrder = new MakeBurgerCommand(cook);
        OrderCommand drinkOrder = new MakeDrinkCommand(cook);

        // 服務生接收訂單
        waiter.takeOrder(burgerOrder);
        waiter.takeOrder(drinkOrder);

        // 送出訂單
        waiter.sendOrdersToKitchen();
    }
}
