package Week4.Enum;

public class EnumDemo02 {
  public static void main(String[] args) {
    printCurrencies();
  }
  public static void printCurrencies(){
    for (Currency ccy : Currency.values()) {
      System.out.println(ccy);
    }
  }
}

/*
Currency [currName=US Dollar, centralBankName=Federal Reserve]
Currency [currName=Pound Sterling, centralBankName=Bank of England]
Currency [currName=Euro, centralBankName=European Central Bank]
Currency [currName=Japanese Yen, centralBankName=Bank of Japan] 
 */