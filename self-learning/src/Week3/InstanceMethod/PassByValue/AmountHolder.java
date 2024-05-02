package Week3.InstanceMethod.PassByValue;

public class AmountHolder {
  
  private int amount;

  public AmountHolder(int amount){
    this.amount = amount;
  }

  public int getAmount(){
    return this.amount;
  }

  public void setAmount(int amount){
    this.amount = amount;
  }
}
