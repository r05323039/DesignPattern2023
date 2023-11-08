package ian.Behavioral.ChainOfResponsibility.level1;

class President extends Staff {
    public President(String name) {
        super(name);
    }

    @Override
    public boolean approvePurchase(int amount) {
        System.out.println(this.name + "同意採購，金額: " + amount);
        return true;
    }
}
