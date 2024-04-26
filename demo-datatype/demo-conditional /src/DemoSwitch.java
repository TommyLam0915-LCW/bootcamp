public class DemoSwitch {
  public static void main(String[] args) {
    char grade = 'A';
    // score > 90 -> A (Pass)
    // 80- 90 -> B (Pass)
    // 70-79-> C (Pass)
    // <70 -> F (Fail)

    // break -> exit

    switch (grade) {
      case 'A':
        System.out.println("This is grade A");
        break;
      case 'B':
        System.out.println("This is grade B");
        break;
      case 'C':
        System.out.println("This is grade C");
        break;
      default:
        System.out.println("Default Value");
    }

    // Grade A : 5
    // B : 4
    // C :3
    // D:2
    // E:1
    int score = 0;
    switch (grade) {
      case 'A':
        System.out.println("This is grade A");
        score++;
      case 'B':
        System.out.println("This is grade B");
        score++;
      case 'C':
        System.out.println("This is grade C");
        score++;
      case 'D':
        System.out.println("This is grade D");
        score++;
      case 'E':
        System.out.println("This is grade E");
        score++;
      default:
        score++;
    }
    System.out.println("score=" + score); //score 6

    //switch (CANNOT compare value)
    switch (score){
      case 5:
      System.out.println("Hello");
      case 4:
      System.out.println("Hello");
      case 3:
      System.out.println("Hello");
      case 2:
      System.out.println("World");
      case 1:
      System.out.println("World");
      default:
    }
    if (score>=3) {
      System.out.println("Hello");
    }else {
      System.out.println("world");
    }
  }
}
