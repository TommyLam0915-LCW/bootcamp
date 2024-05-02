package Week3.InstanceMethod;

public class Varargs {
  // public static void main(String[] args) { //correct syntax

  // }

  // public static void main(String args) { //correct syntax, varargs

  // }

  // // String[] is formal syntax of String array
  // // String args[] is not recommended, but compile will success
  // public static void main (String args[]){

  // }

  public static int sum(int[] nums) {
    int sum = 0;
    for (int num : nums) {
        sum += num;
    }
    return sum;
}

  public static int sum(int... nums) {
    int sum = 0;
    for (int num : nums) {
        sum += num;
    }
    return sum;
}

  // main program: Invoke the method 
  public static void main(String[] args) {
    System.out.println(sum(1,2,3,4,5));
    System.out.println(sum(1,2,3));
    System.out.println(sum());
  }
}
