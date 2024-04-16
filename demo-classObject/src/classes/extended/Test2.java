package classes.extended;

public class Test2 {
  public static void main(String[] args) {
    Dogs d1 = new Dogs();
    System.out.println(d1.getInfo());

    Dogs d2 = new Dogs(30, 10);
    System.out.println(d2.getInfo());

    Dogs d3 = new Dogs("white");
    System.out.println(d3.getInfo());

    Dogs d4 = new Dogs(30, 10, "white");
    System.out.println(d4.getInfo());

    System.out.println("動物數量：" + Animals.totalCount);
    System.out.println("狗狗數量：" + Dogs.totalCount);
  }// end of main(String[])
}// end of class Test

