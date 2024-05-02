package Week3.ClassesAndObjects;

public class Lion {
  private String name;

  private int weight;

  private String color;

  private int age;

  public Lion(String name, int weight, String color, int age){
    this.name = name;
    this.weight = weight;
    this.color = color;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getWeight() {
    return this.weight;
  }

  public String getColor() {
    return this.color;
  }

  public int getAge() {
    return this.age;
  }

  @Override
  public String toString(){
    return "Name: " + name 
    + " , Weight: " + weight
    +" , Color: " + color
    +" , Age: " + age;
  }

}
