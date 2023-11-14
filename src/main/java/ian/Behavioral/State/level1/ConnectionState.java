package ian.Behavioral.State.level1;

interface ConnectionState {
    void connect(NetworkConnection connection);
    void disconnect(NetworkConnection connection);
}