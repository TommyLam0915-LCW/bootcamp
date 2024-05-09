package Week4.DataType4.Polymorphism.StaticPolymorphism;

public class OverloadingClass {

  public void doSomething() {
    System.out.println("do something");
  }

  // Having a different return type is NOT overloading
  // public String doSomething(){
  // return "do something"
  // }

  public void doSomething(String thing) {
    System.out.println("do" + thing);
  }

  public void doSomething(long n){
    for (int i = 1; i<=n; i++){
      System.out.println("do something " + i + "times");
    }
  }
  public void doSomething(String thing, int n){
    for (int i =1; i<=n; i++){
      System.out.println("do" + thing + " "+ i +"times");
    }
  }
  public static void main(String[] args) {
    OverloadingClass c = new OverloadingClass();
    c.doSomething();
    c.doSomething("something else");
    c.doSomething(3);
    c.doSomething("something else", 3);
  }
}

/*
Output:
do something
dosomething else
do something 1times
do something 2times
do something 3times
dosomething else 1times
dosomething else 2times
dosomething else 3times
 */
