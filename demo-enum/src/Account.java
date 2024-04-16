import java.util.Arrays;

public class Account {
  // ...
  private Transaction[] transactions;

  // balance ?
  public Account() {
    this.transactions = new Transaction[0];
  }

  public void add(Transaction transaction) {
    Transaction[] copyArr = this.transactions;
    this.transactions = new Transaction[copyArr.length + 1];
    int idx = 0;
    for (Transaction t : copyArr) {
      this.transactions[idx++] = t;
    }
    this.transactions[idx] = transaction;
  }

  public double balance() {
    double result = 0.0;
    for (Transaction t : transactions) {
      if (t.getSign().equals(Sign.DEBIT))
        result -= t.getAmount();
      else
        result += t.getAmount();

    }
    return result;
  }

  public void credit(Currency currency, double amount) {
    if (currency.equals(this.transactions[0].getCurrency())) {
      amount += this.transactions[0].getAmount();
    }
  }

  public String toString() {
    return Arrays.toString(transactions);
  }

  // boolean
  public void debit(Currency currency, double amount) {
    if (this.transactions[0].getAmount() >= 0) {
      amount -= this.transactions[0].getAmount();
    }
    // this.currency = currency;
    // this.amount = amount;
  }

  public static void main(String[] args) {
    Account account = new Account();
    account.add(new Transaction(Sign.CREDIT, Currency.HKD, 2500));
    account.add(new Transaction(Sign.DEBIT, Currency.HKD, 1300));
    System.out.println(account);
    System.out.println(account.balance()); // 1200

    Account acc1 = new Account();
    Transaction tran1 = new Transaction(Sign.CREDIT, Currency.HKD, 1000);

    // Account credit = new Credit();
    acc1.add(tran1);

    account.debit(Currency.HKD, 500);
  }
}
