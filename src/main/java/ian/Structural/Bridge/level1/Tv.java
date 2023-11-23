package ian.Structural.Bridge.level1;

class Tv implements Device {
    private boolean on = false;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        System.out.println("Tv on");
        this.on = true;
    }

    @Override
    public void disable() {
        System.out.println("Tv off");
        this.on = false;
    }
}
