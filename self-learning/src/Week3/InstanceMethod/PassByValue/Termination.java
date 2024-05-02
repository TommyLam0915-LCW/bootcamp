package Week3.InstanceMethod.PassByValue;

public class Termination {
  // 1. Completes all the statements in the method, i.e. void method
  // 2. Reaches a return statement
  // 3. Throws an exception

  public static void main(String[] args) {
    int c = sum(1, 2);
    System.out.println(" c is " + c);
  }

  public static int sum(int a, int b) {
    return a + b;
  } // Output is 3

  // Remember the *AmountHolder* class
  public class AmountHolder {
    private int amount;

    public AmountHolder(int amount) {
      this.amount = amount;
    }

    public int getAmount() {
      return amount;
    }

    public void setAmount(int amount) {
      this.amount = amount;
    }

    public class ReturningClass {
      // Main method
      public static void main(String[] args) {
        int amount = 10;
        AmountHolder holder = getAmountHolder(amount);
        System.out.println("Holder has amount " + holder.getAmount());
      }


      // Method to create and return an AmountHolder object
      public static AmountHolder getAmountHolder(int amount) {
        AmountHolder amountHolder = new AmountHolder(amount);
        return amountHolder;
      }
    }
  }
}
