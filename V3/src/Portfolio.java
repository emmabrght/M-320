import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private StockExchange exchange;
    private List<Stock> stocks;

    public Portfolio(StockExchange exchange) {
        this.exchange = exchange;
        this.stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double calculatePortfolioValue() {
        double portfolioValue = 0.0;
        for (Stock stock : stocks) {
            double stockPrice = exchange.getStockPrice(stock.getSymbol());
            portfolioValue += stockPrice * stock.getQuantity();
        }
        return portfolioValue;
    }
}
