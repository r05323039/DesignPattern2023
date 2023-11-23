package ian.Structural.Adapter.level1;

class Client {
    public static void main(String[] args) {
            Printer printer = new Printer();
            PrinterAdapter printerAdapter = new PrinterAdapter(printer);
            printerAdapter.printDocument("今天 天氣 真好");
    }
}
