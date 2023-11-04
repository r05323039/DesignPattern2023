package ian.Structural.Decorator.level1;

public abstract class CoffeeDecorator implements Coffee {
    // 裝飾者模式用於給一個對象添加額外的職責，而不需要修改原始類的代碼。
    // 創建一個包裝原始物件(被裝飾)的裝飾者，並在裝飾者中增加新的行為和操作，達到擴展功能的目的。
    private Coffee decorated;//原始物件(被裝飾)
    private String decoratorDescription;//裝飾者特性
    private int decoratorCost;//裝飾者特性


    public CoffeeDecorator(Coffee coffee, int cost) {
        //將原始物件，作為裝飾者的屬性
        this.decorated = coffee;
        this.decoratorDescription = this.getClass().getSimpleName();
        this.decoratorCost = cost;
    }

    @Override
    public String getDescription() {//擴充功能 : 原始物件方法 + 添加功能
        return decorated.getDescription() + " with " + this.decoratorDescription;
    }

    @Override
    public int getCost() {
        return decorated.getCost() + this.decoratorCost;
    }

}
