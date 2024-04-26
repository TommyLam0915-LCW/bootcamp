package trade;

public class Buy {
  private double yourPrice;

  public Buy(double yourPrice) {
    this.yourPrice = yourPrice;
  }

  // Method to execute the buy order
  public void executeBuy(OrderBook orderBook) {
    orderBook.processBuyOrder(yourPrice);
  }
  public static void main(String[] args) {
    
  }
}
