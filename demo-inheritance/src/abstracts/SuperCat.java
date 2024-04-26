package abstracts;

public class SuperCat extends SuperAnimal { 
  
  private int age;

  public SuperCat(int age, String name) {
    super(name); // !!!!!
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  @Override
  public void sleep() {
    System.out.println("Cat is sleeping ...");
  }

  @Override
  public void eat() {
    System.out.println("Cat is eating ...");
  }

  @Override
  public void sit() {
    System.out.println("Cat is siting on the floor ...");
  }


  public static void main(String[] args) {
    SuperCat sc = new SuperCat(3, "Jenny");
    System.out.println(sc.getName());
    System.out.println(sc.getAge());
    sc.sleep();
    sc.run();
    sc.eat();
    sc.sit();
    sc.swim();
  }

}
