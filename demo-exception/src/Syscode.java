package src;

public enum Syscode {
  LOGIN_FAIL(1000,"Loginn Fail."),
  PASSWORD_WRONG(1001, "Password Wrong"),
  ID_NOT_FOUND(1002, "User id not found "),;


  private int code;
  private String desc;

  private Syscode(int code, String desc){
    this.code = code;
    this.desc= desc;
  }

  public int getCode(){
    return this.code;
  }

  public String getDesc(){
    return this.desc;
  }

}
