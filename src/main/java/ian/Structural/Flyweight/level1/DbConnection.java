package ian.Structural.Flyweight.level1;

import java.util.Map;

interface DbConnection {
    void connect();
    void executeQuery(String sql);

    // insert,update,select,delete
}
