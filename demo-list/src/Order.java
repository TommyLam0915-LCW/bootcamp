public class Order {

  private int amount;

  public Order(int amount){
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }

  @Override
  public String toString(){
    return "amount{"
    + " " + getAmount()
    + '}';
  }
}
