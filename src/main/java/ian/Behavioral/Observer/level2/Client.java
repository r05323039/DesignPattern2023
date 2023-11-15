package ian.Behavioral.Observer.level2;

class Client {
    public static void main(String[] args) {
        final String TSMC = "2330";
        final String webcomm = "6865";

        StockMarket stockMarket = new StockMarket();
        stockMarket.addStock(TSMC, 50);
        stockMarket.addStock(webcomm, 20);

        Leek luciano = new Leek("Luciano", stockMarket);
        luciano.addProfolio(TSMC);
        luciano.addProfolio(webcomm);

        Leek jay = new Leek("Jay", stockMarket);
        jay.addProfolio(webcomm);

        for (int i = 0; i < 3; i++) {
            stockMarket.trades();
            System.out.println();
        }

    }
}
