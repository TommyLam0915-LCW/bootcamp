import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Order {
  private int orderId;
  private int customerId;
  private double amount;
  private LocalDate orderDate;

  // Constructor, getter, setter

  public Order(int orderId, int customerId, double amount,
      LocalDate orderDate) {
    this.orderId = orderId;
    this.customerId = customerId;
    this.amount = amount;
    this.orderDate = orderDate;
  }

  public int getOrderId() {
    return this.orderId;
  }

  public int getCustomerId() {
    return customerId;
  }

  public double getAmount() {
    return amount;
  }

  public LocalDate getOrderDate() {
    return orderDate;
  }

  public static void main(String[] args) {
    List<Order> orders = new ArrayList<>();
    orders.add(new Order(1, 101, 800, LocalDate.of(2023, 4, 15)));
    orders.add(new Order(2, 102, 1200, LocalDate.of(2023, 4, 20)));
    orders.add(new Order(3, 101, 1500, LocalDate.of(2023, 4, 25)));
    orders.add(new Order(4, 103, 900, LocalDate.of(2023, 4, 18)));
    orders.add(new Order(5, 102, 1100, LocalDate.of(2023, 4, 22)));

    // Stream
    // 1. Filter orders with amount < 1000
    Map<Integer, Double> result = orders.stream()
        .filter(e -> e.getAmount() < 1000)
        // 2. Sort by descending order by orderDate
        .sorted(
            (o1, o2) -> o1.getOrderDate().isAfter(o2.getOrderDate()) ? -1 : 1)
        // 3. Group by customer ID -> average amount of orders per customer
        .collect(Collectors.groupingBy(Order::getCustomerId,
            Collectors.averagingDouble(Order::getAmount)));

    System.out.println(result);

    // 1. Group orders by customer ID and sum the amounts for each customer
    
    Map<Integer, Double> totalAmounts =
        orders.stream().collect(Collectors.groupingBy(Order::getCustomerId,
            Collectors.summingDouble(Order::getAmount)));

    // 2. Filter orders of customers with total amount > 1100
    List<Order> filteredOrders = orders.stream()
        .filter(order -> totalAmounts.get(order.getCustomerId()) != null
            && totalAmounts.get(order.getCustomerId()) > 1100)
        .collect(Collectors.toList());

    // 3. Print filtered orders
    System.out.println(filteredOrders);
  }
}
