package Week4.Inheritance;

// Abstract classes 
// Cannot be Instantiated :
// May contain Abstract Methods :
// May contain Concrete Methods :
// May Contain Instance Varables :  
// Subclassing (Inheritance) : 

// Abstract class representing a basic shape 
abstract class Shape {
  // Abstract method to calculate the area 
  abstract double area();

  //Concrete method providing default behaviour 
void display(){
    System.out.println("This is a shape. ");
  } 
}
