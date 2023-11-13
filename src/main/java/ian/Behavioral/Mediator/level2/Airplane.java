package ian.Behavioral.Mediator.level2;

class Airplane {
    private String name;


    public Airplane(String name) {
        this.name = name;
    }

    public void requestLanding(AirTrafficControl control) {
        control.requestLanding(this);
    }

    public void notifyDeparture(AirTrafficControl control) {
        control.notifyDeparture(this);
    }

    public String getName() {
        return name;
    }
}
