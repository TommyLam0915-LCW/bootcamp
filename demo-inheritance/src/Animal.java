public class Animal {

  public static

  public static String x = "abc";

  private String name;

  public Animal() {

  }

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sleep() {

  }

  public void run() {

  }

  public static String lowerY() {
    return Cat.y.toLowerCase();
  }



  public static void main(String[] args) {
    Cat c = new Cat(12); // I'm Animal Constructor ...
    Cat c2 = new Cat(4, "Vincent");
    System.out.println(c2.getName()); // Vincent

    Animal animal = new Animal();
    System.out.println(animal.lowerY()); // def
  }
}
