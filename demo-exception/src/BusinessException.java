package src;

public class BusinessException extends Exception {

  private int code;

  private BusinessException(Syscode syscode) {
    super(syscode.getDesc());
    this.code = syscode.getCode();
  }

  public static BusinessException of(Syscode syscode) {
    if (syscode == null)
      throw new IllegalArgumentException();
    return new BusinessException(syscode);
  }

  public static void main(String[] args) throws BusinessException{
    Exception e = new Exception("Login Fail!");

    //Objective: 1000-> login Fail
    // 1001 -> Password Wrong
    // 1002 -> iser id not found 
    BusinessException be = BusinessException.of(Syscode.LOGIN_FAIL);

    // be is a throwable 
      throw be;  
  }
}
