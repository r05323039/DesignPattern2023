package ian.Structural.Decorator.level1;

public class Client {

    public static void main(String[] args) {
        Coffee coffee = new PureCoffee(10);
        System.out.printf("product : %s%nPrice : %d%n", coffee.getDescription(), coffee.getCost());
        // coffee -> PureCoffee物件

        coffee = new Sugar(coffee, 2);
        System.out.printf("product : %s%nPrice : %d%n", coffee.getDescription(), coffee.getCost());
        // coffee -> Sugar物件 , Sugar的Coffee屬性 -> PureCoffee物件

        coffee = new Milk(coffee, 3);
        System.out.printf("product : %s%nPrice : %d%n", coffee.getDescription(), coffee.getCost());
        // coffee -> Milk物件, Mike物件的Coffee屬性 -> Sugar物件, Sugar的Coffee屬性 -> PureCoffee物件

        //一層一層地添加裝飾，原本的coffee的引用對象，會改由Decorator的屬性引用，coffee則指向最外層的Decorator
    }
}
