package ian.Behavioral.Template.level1;

abstract class CaffeineBeverage {
    // 模板方法
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // 共同步驟，private 不需要子類Override
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // 由子類實現的抽象步驟
    protected abstract void brew();

    protected abstract void addCondiments();
}