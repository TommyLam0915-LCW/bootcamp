package Week4.DataType4.Abstraction;

public interface Runner {
  default String speak() {
    return "I am able to run";
  }
}
