package ian.Behavioral.State.level1;


class MusicPlayer {
    private State state;
    private String name;
    private int availablePlayCount = 3;


    public MusicPlayer(String name) {
        this.state = new StoppedState();//預設狀態為停止
        this.name = name;
    }

    public void setState(State state) {
        this.state = state;
        // 由State物件調用，new新的狀態物件，改變player的狀態。
        // 不要自己set，再把this丟進狀態物件
    }

    public void play() {
        state.play(this);
        // 把不同狀態的執行邏輯，封裝進state中，物件只需要改變狀態 : 調用state介面的方法
        // 物件ref狀態，但狀態沒有ref物件，需要透過參數，告訴狀態是哪個物件
    }

    public void stop() {
        state.stop(this);
    }

    public void charge() {
        state.charge(this);
    }

    public void minusPlayCount() {
        availablePlayCount--;
    }

    public void resetPlayCount() {
        availablePlayCount = 3;
    }


    public String getName() {
        return name;
    }

    public int getAvailablePlayCount() {
        return availablePlayCount;
    }
}
