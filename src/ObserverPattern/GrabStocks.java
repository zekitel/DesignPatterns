package ObserverPattern;

public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber =new StockGrabber();

        StockObserver observer1=new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.0);
        stockGrabber.setAaplPrice(22.0);
        stockGrabber.setGoogPrice(99.0);
        System.out.println("**************************");
        stockGrabber.unregister(observer1);
        StockObserver observer2=new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(5);
        stockGrabber.setAaplPrice(2);
        stockGrabber.setGoogPrice(3);

        Runnable getIBM =new GetTheStock(stockGrabber,2,"IBM",197.00);
        Runnable getAAPL =new GetTheStock(stockGrabber,2,"AAPL",45);
        Runnable getGOOG =new GetTheStock(stockGrabber,2,"GOOG",222);

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();



    }
}
