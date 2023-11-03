package ian.Structural.Bridge.level1;

class Controller {
    private Device device;//interface就是"橋"，銜接各種介面的Impl

    public Controller(Device device) {
        this.device = device;
    }

    void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }
}
