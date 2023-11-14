package ian.Behavioral.State.level1;

import java.util.Random;

class DisconnectedState implements ConnectionState {
    @Override
    public void connect(NetworkConnection connection) {
        if (new Random().nextBoolean()) {
            connection.setState(new ConnectedState());
            System.out.printf("連線%s : 連線成功%n", connection.getName());
        } else {
            System.out.printf("連線%s : 連線失敗%n", connection.getName());
        }
    }

    @Override
    public void disconnect(NetworkConnection connection) {
        System.out.println("無效操作:中斷連線");
    }
}
