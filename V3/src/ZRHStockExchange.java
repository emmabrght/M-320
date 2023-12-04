public class ZRHStockExchange implements StockExchange{
        @Override
        public double getStockPrice(String stockSymbol) {
            if (stockSymbol.equals("MSFT")) {
                return 120.0;
            } else if (stockSymbol.equals("GOOGL")) {
                return 150.0;
            }
            return 0.0;
        }
    }

