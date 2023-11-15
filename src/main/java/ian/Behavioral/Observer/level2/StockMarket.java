package ian.Behavioral.Observer.level2;

import java.util.*;

class StockMarket {

    private Map<String, Integer> stockPrices = new HashMap<>();// 如果股票的屬性更多，用Stock物件取代Integer
    private Map<String, List<Observer>> observers = new HashMap<>();

    public void addStock(String symbol, int price) {
        stockPrices.put(symbol, price);
        observers.put(symbol, new ArrayList<>());
    }

    public void registerObserver(String stockSymbol, Observer observer) {
        if (observers.containsKey(stockSymbol)) {
            observers.get(stockSymbol).add(observer);
        }
    }

    public void notifyObservers(String stockSymbol) {
        if (stockPrices.containsKey(stockSymbol)) {
            int price = stockPrices.get(stockSymbol);
            for (Observer observer : observers.get(stockSymbol)) {
                observer.update(stockSymbol, price);
            }
        }
    }

    public void setStockPrice(String stockSymbol, int price) {
        if (stockPrices.containsKey(stockSymbol)) {
            stockPrices.put(stockSymbol, price);
            notifyObservers(stockSymbol);
        }
    }

    public void trades() {
        Set<Map.Entry<String, Integer>> stocks = stockPrices.entrySet();
        for (Map.Entry<String, Integer> stock : stocks) {
            setStockPrice(stock.getKey(), new Random().nextInt(100));
        }
    }
}
