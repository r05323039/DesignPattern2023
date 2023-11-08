package ian.Structural.Flyweight.level1;

import java.util.Map;

class Client {

    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        DbConnection conn1 = pool.getConnection("jdbc:mysql://localhost:3306/mydb", "Ian", "123");
        DbConnection conn2 = pool.getConnection("jdbc:mysql://localhost:3306/mydb", "Ian", "123");
        System.out.println(conn1 == conn2);
        conn1.connect();
        conn1.executeQuery("select 外部狀態");
    }

}
