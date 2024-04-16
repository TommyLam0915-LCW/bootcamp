package classes.extended;

public class Dogs extends Animals {
  String color;
  static int totalCount = 0;

  Dogs(){
    this(-1,-1, "noSet");
  }

  Dogs(int h , int w){
    this(h, w, "noSet");
  }

  Dogs(String c){
    this (-1,-1,c);
  }

  Dogs(int h , int w, String c){
    super(h,w);
    this.color = c;
    totalCount++;
  }

  String getInfo(){
    return super.getInfo()+ " 毛色：" + this.color;
  }
}


