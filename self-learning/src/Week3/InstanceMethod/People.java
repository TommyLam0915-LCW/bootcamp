package Week3.InstanceMethod;

public class People {
  // The people class has four fields
  private String name;
  private int age;
  private int height;
  private int weight;

  // The people class now has a constructor
  public People(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  // The people class has four methods
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public int getWeight(){
    return this.weight;
  }

  public int getHeight(){
    return this.height; 
  }

  @Override
  public String toString() {
    return "Name: " + this.name + ", Age: " + this.age + ", Height: " + this.height + " cm, Weight: " + this.weight + " kg";
  }

  public static void main(String[] args) {
    // Instantiating a People object with initial values
    People person = new People("Tommy", 30, 175, 70);

    // Printing the object's state
    System.out.println(person.toString());
  }
}

