package Week5.DataStructure.ComparableInterface;

public class CustomerComparatorByJoinDate implements Comparator<Customer> {
  
  // sort by Customer's joinDate
  
  @Override 
  public int compare(Customer o1, Customer o2){
    return o1.getJoinDate().compareTo(o2.getJoinDate());
  }
}
