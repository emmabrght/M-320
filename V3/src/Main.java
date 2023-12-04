public class Main {
    public static void main(String[] args) {
        StockExchange NYe = new NYStockExchange();
        StockExchange ZHRe = new ZRHStockExchange();

        Portfolio portfolio = new Portfolio(NYe);

        Stock microsoftStock = new Stock("MSFT", 5);
        portfolio.addStock(microsoftStock);

        double NYePortfolioValue = portfolio.calculatePortfolioValue();
        System.out.println("Portfolio Value on New York Stock Exchange: $" + NYePortfolioValue);

        portfolio = new Portfolio(ZHRe);

        Stock microsoftStockZRH = new Stock("MSFT", 6);
        Stock googleStockZRH = new Stock("GOOGL", 8);
        portfolio.addStock(microsoftStockZRH);
        portfolio.addStock(googleStockZRH);

        double ZRHePortfolioValue = portfolio.calculatePortfolioValue();
        System.out.println("Portfolio Value on Zurich Stock Exchange: CHF " + ZRHePortfolioValue);
    }
}