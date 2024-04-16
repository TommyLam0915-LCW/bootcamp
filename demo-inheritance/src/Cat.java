public class Cat extends Animal{
  
  public static String y ="DEF";

  private int age;

  private String name;

  public Cat(){

  };
  // Child Class Cat object Cat inherit all instance variable, instance methods from Parent Class Animal object
  //but it does not inherit constructor
  public Cat(int age){
    super(); //create Animal's constructor 
    this.age =age;
  }

  //Approach 1 
  public String getCatName(){
    return this.name;
  }
  public void setCatName(String name){
    this.name = name;
  }

  //Approach 2 
  public String getAnimalName(){
    return "name=" + super.getName();
  }

  public Cat(int age, String name){
    super(name);
    this.age = age;
  }

  public int getAge (){
    return this.age; 
  }

  public void setAge (int age){
    this.age = age;
  }

  @Override
  public void sleep(){  //Method signature is same as the Animal object sleep()
    System.out.println("Cat is Sleeping");
  }

public String upperX(){
  return Animal.x.toUpperCase();
}


  //Instance methods
  public static void main(String[] args){
    Cat cat = new Cat(12);
    cat.setName("Jenny");


    //New Animals 

    //Cat has its own instance variable 
    cat.setAge(10);
    System.out.println(cat.getAge());
    //Another child class extends Animal 
    //New Animal 

    //call sleep()
    cat.sleep();
    cat.run(); //Running ... 

    Cat c2 = new Cat(2, "Jenny");
    c2.setCatName("Vincent");
    System.out.println(c2.getCatName()); //Vincent
    System.out.println(c2.getName()); //"Jenny"
    System.out.println(c2.getAnimalName()); //Jenny

    System.out.println(c2.upperX()); //ABC

  }
}