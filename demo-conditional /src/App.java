public class App {
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
        boolean pass = (score >= 70);
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
    }
}
