package Week3.InstanceVariableAndConstructor;

import java.math.BigDecimal;

public class FamilyChild extends FamilyA {
  public BigDecimal getPocketMoney() {
    return super.givePocketMoney(); // equivalent to *super.givePocketMoney()*
  }
}
