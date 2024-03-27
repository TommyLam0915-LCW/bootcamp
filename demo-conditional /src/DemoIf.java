public class DemoIf {
    public static void main(String[] args) throws Exception {
        int x = 1;
        int y = 0;
        if (x > 3) {
            y = 10;
            System.out.println("Hello, World!" + y); // Hello World! + 10
        } else { // x<=3
            y = 100;
            System.out.println("Tommy" + y);// Tommy+100
        }

        if (x > 2) {
            System.out.println("x > 0");
        } else if (x >= 0 && x <= 2) { // AND events
            System.out.println("x >= 0 and x <= 2");
        } else {
            System.out.println("x < 0");
        }

        // Method in only have 2 choose
        int a = 3;
        int b = 10;
        int max = a;

        if (b > a) {
            max = b;
        }
        System.out.println("The max number is" + " " + max + ".");
        // Print out : The max number is 10.

        // Example 2
        String day = "Friday"; // Monday, Tuesday
        String day1 = "Weekday";
        String day2 = "Weekend";

        if (day.equals("Sunday") || day.equals("Saturday")) {
            System.out.println(day + " " + "is" + " " + day2 + ".");
        } else {
            System.out.println(day + " " + "is" + " " + day1 + ".");
        }

        String target = "weekend";
        if ("Monday".equals(day) || "Tuesday".equals(day)
                || "Wednesday".equals(day) || "thursday".equals(day)
                || "Friday".equals(day)) {
            target = "weekday";
        }
        System.out.println(day + "is" + target);

        // Compare Strings
        // 1. String value compares with String Variable ("Monday".equals(days))
        // 2. String variable compares with String variable

        // Example 3
        int score = 69;
        char grade = ' ';
        String examResult = "passed";
        // score > 90 -> A (Pass)
        // 80- 90 -> B (Pass)
        // 70-79-> C (Pass)
        // <70 -> F (Fail)
        if (score > 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score <= 70) {
            grade = 'F';
        }

        if (grade == 'F') {
            examResult = "failed";
        }
        System.out.println(
                "The grade is" + " " + grade + " " + "and" + examResult + ".");

        // String
        String s1 = "hellosss";
        // check if the length of s1>5
        int length0fS1 = (s1.length());
        if (length0fS1 > 5) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if (s1.length() > 5) {
            System.out.println("s1.length()>5");
        }

        // Another approach:(! means NOT)
        if (!(s1.length() <= 5)) {
            System.out.println("s1.length()>5");
        }

        // char (==, >=, <=, >, <, !=)
        char gender = 'F';
        if (gender == 'M') {

        } else if (gender == 'F') {

        }
        if (gender != 'M') {
            System.out.println("gender is not equals to M");
        }
        // int, long, short, byte, float, double (==, >=, <=, >, <, !=)
        int j = 10;
        if (j > 10.2) { // j -> double
            System.out.println("j>10.2");
        } else {
            System.out.println("j<=10.2");
        }
        double u = 10.4;
        if (u > 10) { // 10-> double: 10.4 > 10
            System.out.println("u>10");
        }
        // boolean (==, !=)
        int v = 4;
        boolean b1 = v > 10; // false
        if (b1 == true) {

        }
        if (b1 != false) {

        }
        if (!(b1 == true)) {

        }

        // String.charAt(int index)-> return char
        String s2 = "abcdefg";
        // check if s2 strat with 'a' and end with'g, print out 'yes', otherwise "no"
        if (s2.charAt(0)== 'a' && s2.endsWith("g")){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
