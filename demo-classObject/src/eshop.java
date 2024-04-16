public class eshop {
  private String userID;

  private String paymentMethod;

  private int totalCount;

  public void setUserID(String userID) {
    this.userID = userID;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
    if (totalCount > 100)
      this.totalCount *= 0.9;
  }

  public String toString() {
    return "eshop(" //
        + "userID=" + this.userID //
        + ", paymentMethod=" + this.paymentMethod //
        + ", totalCount=" + this.totalCount //
        + ")";
  }

  public static void main(String[] args) {
    eshop eshop = new eshop();
    eshop.setUserID("A12345678");
    eshop.setTotalCount(200);
    eshop.setPaymentMethod("Credit Card");
    System.out.println(eshop.toString());
  }
}
