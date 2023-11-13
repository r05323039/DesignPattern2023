package ian.Behavioral.Mediator.level2;

class Client {
    public static void main(String[] args) {
        ControlTower controlTower = new ControlTower(2, "桃園機場");

        Airplane airplane1 = new Airplane("ABC123");
        Airplane airplane2 = new Airplane("XYZ789");
        Airplane airplane3 = new Airplane("666666");

        airplane1.requestLanding(controlTower);
        airplane2.requestLanding(controlTower);
        airplane3.requestLanding(controlTower);
        airplane2.notifyDeparture(controlTower);
        airplane3.requestLanding(controlTower);
        airplane2.notifyDeparture(controlTower);
    }
}
