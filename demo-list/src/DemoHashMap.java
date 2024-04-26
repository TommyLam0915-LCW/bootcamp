import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> mapper = new HashMap<>();
        mapper.put("John", 13);
        mapper.put("Vincent", 18);

        System.out.println(mapper.get("Vincent")); // 18
        System.out.println(mapper.get("John")); // 13

        for (Map.Entry<String, Integer> m : mapper.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        mapper.put("Vincent", 20);
        System.out.println(mapper.get("Vincent")); // 20

        mapper.put("Jenny", 24);

        int sum = 0;
        for (int value : mapper.values()) {
            sum += value;
        }
        System.out.println(sum);

        HashMap<Customer, ArrayList<Order>> orderMap = new HashMap<>();
        Customer john = new Customer("John");
        ArrayList<Order> johnOrders = new ArrayList<>();
        johnOrders.add(new Order(100));
        johnOrders.add(new Order(250));
        orderMap.put(john, johnOrders);

        // Similar code for Vincent and other customers

        int totalOrderAmount = 0;
        for (ArrayList<Order> orderList : orderMap.values()) {
            for (Order o : orderList) {
                totalOrderAmount += o.getAmount();
            }
        }
        System.out.println("Total Order Amount: " + totalOrderAmount);

        // Print customer names
        for (Customer customer : orderMap.keySet()) {
            System.out.println("Customer: " + customer.getName());
        }

        // Remove Vincent from orderMap
        orderMap.remove(new Customer("Vincent"));

        System.out.println(orderMap);
    }
}
