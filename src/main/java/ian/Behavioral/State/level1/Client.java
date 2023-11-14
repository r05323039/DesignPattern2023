package ian.Behavioral.State.level1;

class Client {
    public static void main(String[] args) {
        NetworkConnection c = new NetworkConnection("8080");

        c.connect();
        c.connect();
        c.connect();
        c.disconnect();
        c.disconnect();
        c.connect();
        c.connect();
    }
}
