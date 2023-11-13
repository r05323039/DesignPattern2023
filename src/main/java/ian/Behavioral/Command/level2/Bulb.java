package ian.Behavioral.Command.level2;

class Bulb {
    private String name;

    public Bulb(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("turn on " + name);
    }

    public void off() {
        System.out.println("turn off " + name);
    }
}
