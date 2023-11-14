package ian.Behavioral.State.level1;

class NetworkConnection {
    private String name;

    private ConnectionState state;

    public NetworkConnection(String name) {
        this.name = name;
        state = new DisconnectedState();
    }

    public void setState(ConnectionState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    void connect() {
        state.connect(this);
    }

    void disconnect() {
        state.disconnect(this);
    }
}

