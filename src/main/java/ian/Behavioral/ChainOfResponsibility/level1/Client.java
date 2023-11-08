package ian.Behavioral.ChainOfResponsibility.level1;

class Client {
    public static void main(String[] args) {
        Director director = new Director("小主管");
        Manager manager = new Manager("經理");
        President president = new President("老闆");

        director.setNextHandler(manager);
        manager.setNextHandler(president);

        director.approvePurchase(500);
        System.out.println("=====");
        director.approvePurchase(2000);
        System.out.println("=====");
        director.approvePurchase(6000);
        System.out.println("=====");
        director.approvePurchase(20000);
    }
}
