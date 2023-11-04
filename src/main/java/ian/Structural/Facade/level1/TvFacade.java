package ian.Structural.Facade.level1;

class TvFacade {
    // 提供簡化的方法入口，但封裝了很多物件的行為
    private Tv tv;
    private ElectricSystem electricSystem;

    public TvFacade(Tv tv, ElectricSystem electricSystem) {
        this.tv = tv;
        this.electricSystem = electricSystem;
    }

    public void turnOn(){
        electricSystem.on();
        tv.setVolume(5);
    }
    public void turnOff(){
        tv.setVolume(0);
        electricSystem.off();
    }

    public void up(){
        tv.increaseVolume();
    }

    public void down(){
        tv.decreaseVolume();
    }
}
