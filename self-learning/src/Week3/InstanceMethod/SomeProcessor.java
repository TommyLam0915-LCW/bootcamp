package Week3.InstanceMethod;

public class SomeProcessor {
  public void process(String s) {

  }

  // public void process(int i) {}

  // // Compile error, due to same method signature
  // public void process(int j) {}

  // public void process(double a) {}

  // // Compile error, due to same method signature, even return type is different
  // public String process(double b) {}

  public void process(int i, double f) {}
}
// process(String i) and process (int i) are distinct and unique methods 
// because they require different parameter types

