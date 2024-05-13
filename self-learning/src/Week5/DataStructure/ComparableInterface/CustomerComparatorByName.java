package Week5.DataStructure.ComparableInterface;

import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class CustomerComparatorByName implements Comparator<Customer> {

  @Override
  public int compare(Customer o1, Customer o2) {
    return o1.getName().compareTo(o2.getName());
  }

  public static void main(String[] args) {
    List<Customer> customers = new ArrayList<>(); // Initialize your list of customers
    customers.add(new Customer("Carl"));
    customers.add(new Customer("Benny"));
    customers.add(new Customer("Alex"));

    CustomerComparatorByName sortByName = new CustomerComparatorByName();
    Collections.sort(customers, sortByName);

    System.out.println("Before sorting: " + customers);
    System.out.println("After sorting by name: " + customers);


    /*
     * Before sorting: [Carl,Benny, Alex] After Sorting by firstName: [Alex, Benny, Carl]
     */

    // Lambda
    // Comparator<Customer> byName =(o1,o2)-> o1.getName().compareTo(o2.getName()); // lambda expression
    // Comparator<Customer> byJoinDate = (o1,o2) -> o1.getJoinDate().compareTo(o2.getJoinDate());

    // which are equivalent to
    Comparator<Customer> byName = Comparator.comparing(Customer::getName);
    Comparator<Customer> byJoinDate = Comparator.comparing(Customer::getJoinDate);

  }
}

