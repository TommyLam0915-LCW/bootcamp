package classes.extended;

public class Animals {
    int height; 
    int weight;
    static int totalCount = 0;

    Animals(){
      this(-1,-1);
    }
    Animals(int h){
      this(h, -1);
    }
    Animals (int h , int w){
      this.height = h;
      this.weight = w;
      totalCount++;
    }

    String getInfo(){
      return "身長：" + height + " 重量：" + weight;
    }
  }
