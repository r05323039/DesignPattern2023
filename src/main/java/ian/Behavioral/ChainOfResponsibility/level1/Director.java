package ian.Behavioral.ChainOfResponsibility.level1;

class Director extends Staff {

    public Director(String name) {
        super(name);
    }

    @Override
    public boolean approvePurchase(int amount) {
        if (amount < 1000) {
            System.out.println(this.name + "同意採購，金額: " + amount);
            return true;
        }
        System.out.println(this.name + "無此權限");
        return next.approvePurchase(amount);
    }
}
