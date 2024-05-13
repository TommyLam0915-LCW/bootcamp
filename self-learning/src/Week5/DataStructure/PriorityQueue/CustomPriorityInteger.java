package Week5.DataStructure.PriorityQueue;

import java.util.Comparator;

public class CustomPriorityInteger implements Comparator<Integer> {
  @Override
  public int compare(Integer a, Integer b) {
    // Custom logic to reverse the default ordering
    return a < b ? -1 : 1;
  }
}

