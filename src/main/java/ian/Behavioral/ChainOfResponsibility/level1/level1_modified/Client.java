package ian.Behavioral.ChainOfResponsibility.level1.level1_modified;

class Client {
    public static void main(String[] args) {
        Director director = new Director("小主管", 1000);
        Manager manager = new Manager("經理", 5000);
        President president = new President("老闆", Integer.MAX_VALUE);

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
