package src;

public class App {
    public static void main(String[] args) {
        // checked exception (compile time exception)

        // unchecked exception (run-time exception)
        // if salary array contain negative value, you treat total as 0.
        int total = 0;
        try {
            total = totalSalary(new int[] {100, -10, 45}); // java.lang.IllegalArgumentException
        } catch (IllegalArgumentException e) {
            total = 0;
        }
        System.out.println("total=" + total);

        int x = 0;
        int r = x == 0 ? 0 : 8 / x;

        int r2 = 0;
        try {
            r2 = 8 / x; // java.lang.ArithmeticException
        } catch (ArithmeticException e) {
            // send sms
            // send email to you boss
        }
        try {
            getString(new char[] {'c', 'a', 't'}, -2, 2);
        } catch (ArrayIndexOutOfBoundsException e) {
            // ...
        }

        // 4. NullPointerException
        String s = "hello";
        s = null;
        try {
            System.out.println(s.charAt(0)); // java.lang.NullPointerException
        } catch (NullPointerException e) {
            //What to do???
        }
        //Solution 2:
        if (s!=null){
            System.out.println(s.charAt(0));
        }

        // 5. StringIndexOutOfBoundsException
        String s2 = "hello";
        try {
            System.out.println(s2.charAt(5));
        } catch (StringIndexOutOfBoundsException e) {

        }

        // 6. IllegalStateException
        int n1 = 7;
        int n2 = -8;

        try {
            if (n1 + n2 > 0) {
                checkParameters(n1, n2);
            }
        } catch (IllegalStateException e) {
            System.out.println("Handled the IllegalStateException");
        }

        // 7. NumberFormatException
        try{
            int num = Integer.parseInt("10");
        } catch(NumberFormatException e){
            System.out.println("Handled the NumberFormatException");
        }
    }

    public static String getString(char[] characters, int beginIdx,
            int endIdx) {
        StringBuilder sb = new StringBuilder();
        for (int i = beginIdx; i <= endIdx; i++) {
            sb.append(characters[i]);
        }
        return sb.toString();
    }

    public static int totalSalary(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            if (x < 0)
                throw new IllegalArgumentException(); // an error event
            sum += x;
        }
        return sum;
    }

    public static void checkParameters(int n1, int n2) {
        if (n1 + n2 > 0)
            System.out.println("it is correct state");
        if (n1 * n2 > 100)
            System.out.println("it is incorrect state");
        throw new IllegalStateException();
    }
}
