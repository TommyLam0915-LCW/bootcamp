package Week3.ClassesAndObjects;

public class LionDemo {
  public static void main(String[] args) {
    Lion lion1 = new Lion("Tommy", 80, "White", 4);
    Lion lion2 = new Lion("Michelle", 50, "Yellow", 5);

    lion1.toString();
    System.out.println(lion1.toString());
    System.out.println(lion2.toString());
  }
}
