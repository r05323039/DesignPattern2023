package ian.Structural.Facade.level1;

class Tv {
    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
        printVolume();
    }

    void increaseVolume() {
        volume++;
        printVolume();
    }

    void decreaseVolume() {
        volume--;
        printVolume();
    }

    private void printVolume() {
        System.out.println("TV volume : " + this.volume);
    }

}
