package ian.Structural.Adapter.level1;

public class PrinterAdapter implements Computer{
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    public void printDocument(String content) {
        String[] lines = content.split(" ");
        oldPrinter.print(lines);
    }//OldPrinter接收String[]一次打印一組字串，透過Adaptor將整個content切成String[]讓其可以工作

    public static void main(String[] args) {
        Printer printer = new Printer();
        PrinterAdapter printerAdapter = new PrinterAdapter(printer);
        printerAdapter.printDocument("今天 天氣 真好");
    }
}
