public class Transaction {

  private Sign sign;
  private Currency currency;
  private double amount;

  public Transaction(Sign sign, Currency currency, double amount) {
    this.sign = sign;
    this.currency = currency;
    this.amount = amount;
  }

  public Currency getCurrency() {
    return this.currency;
  }

  public Sign getSign() {
    return this.sign;
  }

  public double getAmount() {
    return this.amount;
  }

  public String toString() {
    return this.sign + "," + this.currency + "," + this.amount;
  }

}
