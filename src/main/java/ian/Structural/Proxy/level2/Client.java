package ian.Structural.Proxy.level2;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        BookSearchProxy proxy = new BookSearchProxy(new BookSearchService());
        System.out.println(proxy.search("Java手冊"));
        System.out.println(proxy.search("Java手冊"));
        System.out.println(proxy.search("Python手冊"));
    }
}
