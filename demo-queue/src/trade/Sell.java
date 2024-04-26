package trade;

public class Sell {
  private double yourPrice;

  public Sell(double yourPrice) {
    this.yourPrice = yourPrice;
  }

  // Method to execute the sell order
  public void executeSell(OrderBook orderBook) {
    orderBook.processSellOrder(yourPrice);
  }
}
