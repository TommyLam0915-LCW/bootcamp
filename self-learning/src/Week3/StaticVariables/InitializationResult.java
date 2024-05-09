package Week3.StaticVariables;

public class InitializationResult {
    public static void main(String[] args) {
        // Create objects of ClassA and ClassB
        ClassA objectA = new ClassA();

        // Print instance variable someString of objectA and objectB
        System.out.println("objectA.someString= " + objectA.someString);
       

        // Print static variable SOME_NUMBER of ClassA and ClassB
        System.out.println("ClassA.SOME_NUMBER= " + ClassA.SOME_NUMBER);
       
        // Increment someOtherNumber of ClassB
        ClassA.someOtherNumber += 1;

        // Print someOtherNumber of ClassA
        System.out.println("ClassA.someOtherNumber =" + ClassA.someOtherNumber);
    }
}
