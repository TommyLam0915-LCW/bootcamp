package Week3.InstanceVariableAndConstructor;

import java.math.BigDecimal;

public class FamilyBChild { // not a subclass of FmailyA
  // Cannot access FamilyA's *givePocketMoney* method, due to diff, package & not subclass
  // Can only access *giveRedEnvelopeMoney* method
  public BigDecimal getPocketMoney(FamilyA familyA){
    return familyA.givePocketMoney(); //compile error
  }
}
