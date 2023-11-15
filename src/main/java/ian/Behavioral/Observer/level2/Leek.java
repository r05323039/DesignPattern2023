package ian.Behavioral.Observer.level2;

class Leek implements Observer {
    private String name;
    private StockMarket market;

    public Leek(String name, StockMarket market) {
        this.name = name;
        this.market = market;
    }

    public void addProfolio(String symbol) {
        market.registerObserver(symbol, this);
    }

    @Override
    public void update(String stockSymbol, int price) {
        System.out.println(name + " notified about " + stockSymbol + ": " + price);
    }
}
