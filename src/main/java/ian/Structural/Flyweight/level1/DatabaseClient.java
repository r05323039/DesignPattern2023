package ian.Structural.Flyweight.level1;

class DatabaseClient {
    private ConnectionPool pool = new ConnectionPool();

    public void query(String connectionString, String user, String password) {
        DbConnection connection = pool.getConnection(connectionString, user, password);
        connection.connect(); // 这里可以执行数据库操作
        System.out.println(connection + " : 查詢");
        // 執行增刪改查
    }
    public void delete(String connectionString, String user, String password) {
        DbConnection connection = pool.getConnection(connectionString, user, password);
        connection.connect(); // 这里可以执行数据库操作
        System.out.println(connection + " : 刪除");
        // 執行增刪改查
    }

    public static void main(String[] args) {
        DatabaseClient client = new DatabaseClient();
        client.query("jdbc:mysql://localhost:3306/mydb", "Ian", "123");
        client.query("jdbc:mysql://localhost:3306/mydb", "Ian", "123");
        client.delete("jdbc:mysql://localhost:3306/mydb", "Ian", "123");
        // 物件都同一個
    }

}
