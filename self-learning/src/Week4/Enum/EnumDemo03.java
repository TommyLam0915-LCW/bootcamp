package Week4.Enum;

public class EnumDemo03 {
  public static void main(String[] args) {
    useEnumTypesInSwitch();
  }

  public static void useEnumTypesInSwitch() {
    for (Currency ccy : Currency.values()) {
      switch (ccy) {
        case EUR:
          System.out.println(
              ccy.getCurrName() + "(" + ccy.name() + ")" + " is fluctuating!");
          break;
        case USD:
          System.out.println(
              ccy.getCurrName() + "(" + ccy.name() + ")" + " is rising!");
          break;
        case GBP:
          System.out.println(
              ccy.getCurrName() + "(" + ccy.name() + ")" + " is dropping!");
          break;
        case JPY:
          System.out.println(
              ccy.getCurrName() + "(" + ccy.name() + ")" + " is stagnant!");
          break;
        default:
          throw new IllegalArgumentException("Unknown Currency");
      }
    }
  }
}

/*
 Output:

US Dollar(USD) is rising!
Pound Sterling(GBP) is dropping!
Euro(EUR) is fluctuating!
Japanese Yen(JPY) is stagnant!
 */

