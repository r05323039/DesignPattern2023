package ian.Structural.Flyweight.level1;

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
}
