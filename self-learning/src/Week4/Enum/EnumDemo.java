package Week4.Enum;

public class EnumDemo {
  public static void main(String[] args) {
    printCurrencyConditionally();
  }

  public static void printCurrencyConditionally() {
    for (Currency ccy : Currency.values()) {
      if (ccy == Currency.USD) {
        System.out.printf("%s has stopped Quantitative Easing!\n",
            ccy.getCentralBankName());
      } else if (ccy == Currency.EUR) {
        System.out.printf("%s is fluctuating!\n", ccy.valueOf("EUR"));
      }
    }
  }
}

/*
 * Federal Reserve has stopped Quantitative Easing! 
 * EUR is fluctuating
 */
