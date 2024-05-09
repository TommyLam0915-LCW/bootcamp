package Week3.StaticVariables;

public class ShoeFactory {
  private static int numOfWorkers;
  private boolean running = false;


  // static Initalization Blocks
  static {
    // perform initialization here
    numOfWorkers = 102;
  }

  private static String someVar = initializeStaticVariable();

  // private static method
  private static String initializeStaticVariable() {
    // initalization code goes here
  }
}

