package ian.Structural.Flyweight.level1;

import java.util.HashMap;
import java.util.Map;

class ConnectionPool {
    private Map<String, DbConnection> connections = new HashMap<>();//Map<key, 享元介面> ，key須為不可變且唯一

    public DbConnection getConnection(String database, String user, String password) {
        String key = database + ":" + user + ":" + password; // 使用組合確保唯一
        if (!connections.containsKey(key)) {//假設資料庫是唯一的
            connections.put(key, new DbConnectionImpl(database, user, password));
            System.out.println("享元工廠內查不到，創建新connect");
        }
        // 如果不存在，則創建後放入Map，並總是從Map取出
        return connections.get(key);
    }
}