package ian.Structural.Proxy.level1;

class Client {
    public static void main(String[] args) {
        SensitiveDataProxy proxy = new SensitiveDataProxy("1234");
        System.out.println(proxy.getData());

        SensitiveDataProxy proxy1 = new SensitiveDataProxy("admin");
        System.out.println(proxy1.getData());
    }
}
