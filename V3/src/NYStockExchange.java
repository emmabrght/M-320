public class NYStockExchange implements StockExchange {
        @Override
        public double getStockPrice(String stockSymbol) {
            if (stockSymbol.equals("MSFT")) {
                return 100.0;
            } else if (stockSymbol.equals("GOOGL")) {
                return 130.0;
            }
            return 0.0;
        }
    }
