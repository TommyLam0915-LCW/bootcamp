package Week4.Enum;

public enum Season { // impilicit static final, why?
  SPRING(1), SUMMER(2), AUTUMN(3), WINTER(4);

  private int code;

  private Season(int code){
    this.code = code;
  }

  // Other methods 
}
