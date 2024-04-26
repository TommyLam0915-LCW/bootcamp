package trade;

import java.util.Scanner;

public class OrderBookTest {
    public static void main(String[] args) {

        OrderBook orderBook = new OrderBook(1.0, 1.0, 2.0, 2.0);

        Scanner s = new Scanner(System.in);
        System.out.println("In which price you want to buy this stock?");
        double price = s.nextDouble();
        
        if (price < 1.0 || price > 2.0) {
            System.out.println("Price must be between $1 and $2.");
            return; // Exit the program if price is not within the range
        }

        System.out.println("You will use : $" + price + " to buy");
        System.out.println("How many quantity you want to buy this stock?");
        double quantity = s.nextDouble();
        System.out.println("You will buy : " + quantity);

        double totalPrice = price * quantity;

        orderBook.processOrder(totalPrice); // Assuming processOrder method handles both buy and sell orders
    }
}
// // Simulate buy orders
// Buy buyOrder1 = new Buy(0.95);
// buyOrder1.executeBuy(orderBook);

// Buy buyOrder2 = new Buy(1.05);
// buyOrder2.executeBuy(orderBook);

// // Simulate sell orders
// Sell sellOrder1 = new Sell(1.10);
// sellOrder1.executeSell(orderBook);

// Sell sellOrder2 = new Sell(0.98);
// sellOrder2.executeSell(orderBook);

