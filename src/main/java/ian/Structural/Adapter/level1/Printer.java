package ian.Structural.Adapter.level1;

public class Printer implements OldPrinter {
    public void print(String[] content) {
        for(String line : content)
            System.out.println(line);
    }
}
