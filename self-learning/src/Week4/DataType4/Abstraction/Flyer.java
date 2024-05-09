package Week4.DataType4.Abstraction;


// When superclasses or upstream interfaces provide multiple default methods with same signature
// 1. Instance method are preferred over interface default methods.
// 2. Methods that are already overridden by closer ancestors take precedence
public interface Flyer {
  default String speak(){
    return "I am able to fly. ";
  }
}
