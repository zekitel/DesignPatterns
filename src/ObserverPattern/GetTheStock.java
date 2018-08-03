package ObserverPattern;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber,int startTime, String stock, double price ) {
        this.startTime = startTime;
        this.stock = stock;
        this.price = price;
        this.stockGrabber = stockGrabber;
    }

    @Override
    public void run() {
        for (int i=1;i<=20;i++){
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }




            if(stock.equals("IBM") ){
                this.price=this.price+1;
                ((StockGrabber)stockGrabber).setIbmPrice(price);
            }

            if(stock.equals("AAPL")){
                this.price=this.price+2;
                ((StockGrabber)stockGrabber).setAaplPrice(price);
            }
            if(stock.equals("GOOG")){
                this.price=this.price+3;
                ((StockGrabber)stockGrabber).setGoogPrice(price+3);
            }

        }

    }
}
