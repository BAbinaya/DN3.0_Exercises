package observerPattern;

public class Test {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp = new WebApp("WebApp");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp);

        System.out.println("Setting stock price to 100.00");
        stockMarket.setPrice(100.00);

        System.out.println("\nDeregistering MobileApp2");
        stockMarket.deregisterObserver(mobileApp2);

        System.out.println("Setting stock price to 150.00");
        stockMarket.setPrice(150.00);
    }
}
