
//package JUnit;
//
//public class Assert_NotNull_Assert_Null {
// import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.*;
//
//    class StockData{
//        private String stockSymbol;
//        private double price;
//        private int volume;

//        public StockData(String stockSymbol, double price, int volume) {
//            this.stockSymbol = stockSymbol;
//            this.price = price;
//            this.volume = volume;
//        }
//
//        public String getStockSymbol() {
//            return stockSymbol;
//        }
//
//        public void setStockSymbol(String stockSymbol) {
//            this.stockSymbol = stockSymbol;
//        }
//
//        public double getPrice() {
//            return price;
//        }
//
//        public void setPrice(double price) {
//            this.price = price;
//        }
//
//        public int getVolume() {
//            return volume;
//        }
//
//        public void setVolume(int volume) {
//            this.volume = volume;
//        }
//    }
//
//    class FinanceService{
//        public StockData getStockData(String stockSymbol){
////        Simulated logic to retrieve stock data based on the stock symbol
////        In this example, we assume a static set of stock data for demonstration purposes
//
////        Simulated stock data for AAPL (Apple Inc.)
//            if (stockSymbol.equals("AAPL")){
//                return new StockData("AAPL", 148.99, 10000);
//            }
////        Simulated stock data for GOOGL (Alphabet Inc.)
//            else if(stockSymbol.equals("GOOGL")){
//                return new StockData("GOOGL", 2799.21, 5000);
//            }
////        Return null if stock data is not available for the givem=n stock symbol
//            return null;
//        }
//    }
//    class MainTest{
//        @Test
//        public void testNotSupportedStockSymbol(){
//            FinanceService financeServiceObj = new FinanceService();
//            assertNull(financeServiceObj.getStockData("TSLA"), "TSLA should not be in the listed stocks");
//        }
//        @Test
//        public void testApple(){
//
//            FinanceService financeServiceObj = new FinanceService();
//            assertNotNull(financeServiceObj.getStockData("AAPL"), "AAPL wasn't found in the sctock listing");
//            assertEquals(148.99, financeServiceObj.getStockData("AAPL").getPrice(), "Apple stock price mismatch");
//            assertEquals(10000, financeServiceObj.getStockData("AAPL").getVolume(), "Apple stock volume mismatch");
//        }
////  Difference between hard assertioin and Soft-Assertion
//// Hard Assertion is when you have multiple assertions for one test case and one
//// assertion fails - the test is going to stop executing
//
//// soft assertion - you have multiple asserions for one test case and
//// the test is going to execute all assertions and only after that give a report of all assertions
//
//    }