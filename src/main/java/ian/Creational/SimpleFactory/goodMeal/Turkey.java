package ian.Creational.SimpleFactory.goodMeal;

public class Turkey implements Meat{
    public void cook() {
        System.out.println("cook Turkey");
    }

    public void delivery() {
        System.out.println("delivery Turkey");
    }
}
