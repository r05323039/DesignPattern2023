package ian.Structural.Flyweight.level1;

import java.util.Map;

class DbConnectionImpl implements DbConnection {
    //具體享元類，
    private String database;//內部狀態，假設DB的連線只有一條，可共用 (定義資料庫連線的唯一性)
    private String user;
    private String password;

    public DbConnectionImpl(String connectionString, String account, String password) {
        this.database = connectionString;
        this.user = account;
        this.password = password;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to " + database);
    }

    @Override
    public void executeQuery(String sql) {
        // SQL、params為外部狀態，每次調用可不同
        System.out.println("Executing SQL: " + sql);

    }
}
