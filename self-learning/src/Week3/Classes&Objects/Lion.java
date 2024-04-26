public class Lion {
  private String name;
  private int weight;
  private String color;
  private int age;

  public void setName(String name) {
    this.name = name;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "name: " + name + 
           ", weight: " + weight + 
           ", color: " + color + 
           ", age: " + age;
  }

  public static void main(String[] args) {
    Lion lion1 = new Lion();
    Lion lion2 = new Lion();

    // Setting properties for lion1
    lion1.setName("Tommy");
    lion1.setWeight(400);
    lion1.setColor("Yellow");
    lion1.setAge(5);

    // Setting properties for lion2
    lion2.setName("Simba");
    lion2.setWeight(350);
    lion2.setColor("Golden");
    lion2.setAge(3);

    // Printing the state of lion1
    System.out.println(lion1.toString());

    // Printing the state of lion2
    System.out.println(lion2.toString());
  }
}

