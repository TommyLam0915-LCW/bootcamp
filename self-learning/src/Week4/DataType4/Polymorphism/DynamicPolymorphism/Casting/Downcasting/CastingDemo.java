package Week4.DataType4.Polymorphism.DynamicPolymorphism.Casting.Downcasting;

public class CastingDemo {
    public static void main(String[] args) {
        // Scenario 1
        ParentClass parentObject = new SubclassC(); // upcasting
        parentObject.doSomething(); // can still access child's overridden method
        // parentObject.doSomethingElse(); 
        // Compile error, can no longer access child's method

        SubclassC childObject2 = (SubclassC) parentObject; // downcasting 
        childObject2.doSomethingElse(); // can access child method again

        // Scenario 2 
        // Cause Runtime error - class SubclassC  cannot be cast to class SomeOtherClass
        // To solve, add if (parentObject instanceOf SomeOtherClass)
        // SomeOtherClass childObjcet3 = (SomeOtherClass) parentObject;

        // if we got Factory Pattern (method produceChild())
        ParentClass child = produceChild(2);
    }

    public static ParentClass produceChild(int type) {
        // Implement your factory logic here
        if (type == 1) {
            return new SubclassC();
        } else {
            return new SomeOtherClass();
        }
    }
}

