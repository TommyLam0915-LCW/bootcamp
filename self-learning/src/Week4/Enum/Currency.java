package Week4.Enum;

public enum Currency {
  USD("US Dollar", "Federal Reserve"), 
  GBP("Pound Sterling", "Bank of England"), 
  EUR("Euro", "European Central Bank"), 
  JPY("Japanese Yen", "Bank of Japan");

  private final String currName;
  private final String centralBankName;

  Currency(String currName, String centralBankName) {
      this.currName = currName;
      this.centralBankName = centralBankName;
  }

  public String getCurrName() {
      return this.currName;
  }

  public String getCentralBankName() {
      return this.centralBankName;
  }

  @Override
  public String toString() {
      return String.format("Currency [currName=%s, centralBankName=%s]", this.currName, this.centralBankName);
  }
}


