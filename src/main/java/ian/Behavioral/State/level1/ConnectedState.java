package ian.Behavioral.State.level1;

class ConnectedState implements ConnectionState {
    @Override
    public void connect(NetworkConnection connection) {
        System.out.println("無效操作:重複連線");
    }

    @Override
    public void disconnect(NetworkConnection connection) {
        System.out.printf("連線%s : 離開連線%n", connection.getName());
        connection.setState(new DisconnectedState());
    }
}
