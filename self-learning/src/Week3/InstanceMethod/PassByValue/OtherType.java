package Week3.InstanceMethod.PassByValue;

public class OtherType {
  // public static void addLab(StringBuilder name) { // StringBuilder is mutable
  //   name.append("LAB");
  // }
  // public static void main(String[] args) {
  //   StringBuilder name = new StringBuilder("Venturenix ");
  //   addLab(name); 
  //   System.out.println(name); //print "Venturenix LAB"
  // } // Output "Venturenix LAB"


  public static void doSomething(AmountHolder a){
    //the object reference of "holder" is abc123(abc123 is Object Address)
    a = new AmountHolder(99); // will not change the original reference
    // the object reference of "holder" become bcd234 (bcd234 is Object Address) 
    }
    public static void doOtherThing(AmountHolder a ){
      // find the object in heap AND set the amount 
      a.setAmount (100);
  }    
  public static void main(String[] args) {
    AmountHolder holder = new AmountHolder(10);
    doSomething(holder);
    System.out.println("Amount is " + holder.getAmount()); //10, why not 99?
    doOtherThing(holder);
    System.out.println("Amount is " + holder.getAmount());
  }
}
