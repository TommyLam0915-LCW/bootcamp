import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Product {
  private String name;
  private String category;
  private double price;
  private int quantity;

  public Product(String name, String category, double price, int quantity) {
    this.name = name;
    this.category = category;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }

  public String getCategory() {
    return this.category;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();
    products.add(new Product("Laptop", "Electronics", 1200, 5));
    products.add(new Product("Book", "Stationery", 500, 10));
    products.add(new Product("Watch", "Fashion", 1500, 3));
    products.add(new Product("Headphones", "Electronics", 800, 8));
    products.add(new Product("Shoes", "Fashion", 2000, 2));

    // Stream
    // 1. Filter all products with price > 1000
    List<String> result = products.stream().filter(e -> e.getPrice() > 1000)
        // 2. Sort ascending order by name
        .sorted((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()))
        // 3. Map the result set to a list of strings "Name-Quantity"
        .map(p -> p.getName() + "-" + p.getQuantity())
        // 4. Collect to List<String>
        .collect(Collectors.toList());

    System.out.println(result);
  }
}
