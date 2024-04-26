package trade;

import java.util.Map;


public class OrderBook {
  private double marketPrice;
  private double priceRangeMin;
  private double priceRangeMax;
  private double priceRestriction;

  public OrderBook(double initialMarketPrice, double priceRangeMin,
      double priceRangeMax, double priceRestriction) {
    this.marketPrice = initialMarketPrice;
    this.priceRangeMin = priceRangeMin;
    this.priceRangeMax = priceRangeMax;
    this.priceRestriction = priceRestriction;
  }

  public void processBuyOrder(double yourPrice) {
    if (yourPrice >= marketPrice) {
      if (yourPrice <= priceRangeMax) {
        marketPrice = yourPrice;
        System.out.println(
            "Buy order processed at: " + yourPrice + ". Market price updated.");
      } else {
        System.out.println("Buy order rejected. Price exceeds maximum limit.");
      }
    } else {
      System.out.println(
          "Buy order rejected. Price is too low compared to market price.");
    }
  }

  public void processSellOrder(double yourPrice) {
    if (yourPrice <= marketPrice) {
      if (yourPrice >= priceRangeMin) {
        marketPrice = yourPrice;
        System.out.println("Sell order processed at: " + yourPrice
            + ". Market price updated.");
      } else {
        System.out.println("Sell order rejected. Price below minimum limit.");
      }
    } else {
      System.out.println(
          "Sell order rejected. Price is too high compared to market price.");
    }
  }

  public void processOrder(double price) {
    if (price < 1.0 || price > 2.0) {
    }
    System.out
        .println("Order processed at: $" + price + ". Market price updated.");
  }
}
