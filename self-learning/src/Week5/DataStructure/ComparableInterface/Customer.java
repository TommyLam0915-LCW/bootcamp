package Week5.DataStructure.ComparableInterface;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Customer implements Comparable<Customer> {
  private int id;
  private String name;
  private LocalDate joinDate;

  public Customer(int id, String name, LocalDate joinDate) {
    this.id = id;
    this.name = name;
    this.joinDate = joinDate;
  }

  public Customer( String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public LocalDate getJoinDate() {
    return joinDate;
  }

  @Override
  public String toString() {
    return "Customer{" + "id = " + id + ",name= " + name + '\'' + ", joinDate= "
        + joinDate + '}';
  }

  @Override
  public int compareTo(Customer o) {
    return Integer.compare(this.id, o.getId());
  }

  public static void main(String[] args) {

    Customer customer1 = new Customer(1, "Alex", LocalDate.of(2022, 1, 1));
    Customer customer2 = new Customer(2, "Benny", LocalDate.of(2022, 1, 15));
    Customer customer3 = new Customer(3, "Carl", LocalDate.of(2022, 12, 31));

    List<Customer> customers = new ArrayList<>();
    customers.add(customer3);
    customers.add(customer2);
    customers.add(customer1);

    System.out.println("Before Sorting: " + customers);
    // Collections.sort(customers); //Compilation error
    System.out.println("After Sorting: " + customers);



  }
}
