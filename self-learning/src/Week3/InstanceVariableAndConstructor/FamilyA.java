package Week3.InstanceVariableAndConstructor;

import java.math.BigDecimal;

public class FamilyA {
  private static BigDecimal cashAmount = new BigDecimal("10000");
  private static final BigDecimal POCKET_MONEY_RATIO = new BigDecimal("0.05"); 
  private static final BigDecimal RED_ENVELOPE_RATIO = new BigDecimal("0.01");

  // Accessible only to FamilyA's sunclasses or same package 
  protected BigDecimal givePocketMoney(){
    return cashAmount.multiply(POCKET_MONEY_RATIO);
  }

  //Accessible to all other classes 
  public BigDecimal giveRedEnvelopeMoney(){
    return cashAmount.multiply(RED_ENVELOPE_RATIO);
  }
}
