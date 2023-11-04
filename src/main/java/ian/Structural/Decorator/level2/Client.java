package ian.Structural.Decorator.level2;

public class Client {
    public static void main(String[] args) {
        TextFile file = new TextFileDecoreted("123456789");

        file = new EncryptDecorator(file);
        System.out.println(file.open());
        System.out.println(file.read());
    }
}
