package ian.Behavioral.Mediator.level2;


class ControlTower implements AirTrafficControl {

    private String name;

    private Airplane[] apron;// 最大停放飛機數

    public ControlTower(int space, String name) {
        this.apron = new Airplane[space];
        this.name = name;
    }

    @Override
    public void requestLanding(Airplane airplane) {
        for (int i = 0; i < apron.length; i++) {
            if (apron[i] == null) {
                System.out.printf("%s回報%s : 可停入 %d號空間%n", name, airplane.getName(), i);
                apron[i] = airplane;
                return;
            }
        }
        System.out.printf("%s回報%s : 目前無可用空間%n", name, airplane.getName());
    }

    @Override
    public void notifyDeparture(Airplane airplane) {
        for (int i = 0; i < apron.length; i++) {
            if (apron[i] != null && apron[i].equals(airplane)) {
                System.out.printf("%s回報 : %s即將離開%d號空間%n", name, airplane.getName(), i);
                apron[i] = null;
                return;
            }
        }
        System.out.printf("%s回報 : 目前空間內無此飛機 : %s%n", name, airplane.getName());
    }
}
