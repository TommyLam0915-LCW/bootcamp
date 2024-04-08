public class DemoForLoop {
    public static void main(String[] args) {
        // int x = 2;
        // x = x * x; // 2 * 2 = 4
        // x *= x; // 4 * 4 = 16
        // System.out.println(x);

        // 2^60

        //
        // System.out.println("Hello World");
        // System.out.println("Hello World");

        // for (initialization; continue condition; incremental rule)
        // for (int i = 0; i < 3; i++) { // 0, 1, 2
        // // Step 1 : int i = 0
        // // Step 2 : i < 3 ? yes
        // // Step 3 : print Hello World
        // // Step 4 : i++ -> i become 1
        // // Step 5 : i < 3 ? yes
        // // Step 6 : print Hello World
        // // Step 7 : i++ -> i become 2
        // // Step 8 : i < 3 ? yes
        // // Step 9 : print Hello World
        // // Step 10 : i++ -> i become 3
        // // Step 11 : i < 3 ? no

        // // Never to re-assign value to i within the loop
        // // i++;

        // System.out.println("Hello World" + i);
        // }

        // for (int i = 5; i >= 0; i--) { // 5,4,3,2,1,0
        // System.out.println("Hello World" + " " + i);
        // }
        // // print out: 1,3,5,7,9
        // for (int i = 1; i < 10; i += 2) {
        // System.out.println(i + " ");
        // }
        // for (int i = 0; i < 10; i++) {
        // if (i % 2 != 0) { // odd number
        // System.out.println(i + " ");
        // }
        // }

        // String s = "abcdefg";
        // // print out aceg
        // // charAt, String concat

        // for (int i = 0; i < s.length(); i += 2) { // 0,1,2,3,4,5,6
        // char c = s.charAt(i);
        // System.out.print(c + " ");
        // }

        // String s1 = "abcdefg";
        // String result = "";
        // for (int i = 0; i < s1.length(); i++) { // 0,1,2,3,4,5,6
        // if (i % 2 == 0) {
        // result += s1.charAt(i); // 0,2,4,6
        // }
        // }
        // System.out.println(result);

        // String s2 = "cd";
        // print true


        // // 55= 1 + 2+ 3 + 4...+ 10
        // int max = 10;
        // int min = 1;
        // int sum = 0;

        // for (int i = min; i <= max; i++) {
        // sum += i;

        // }
        // System.out.println(sum); // 55

        // // sum up all even numbers
        // int max01 = 10;
        // int min01 = 1;
        // int sum01 = 0;

        // for (int i = min01; i <= max01; i++) {
        // if (i % 2 == 0) {
        // sum01 += i;
        // }
        // }
        // System.out.println(sum01);

        // // Counting
        // String str = "Hello World";
        // int count = 0;
        // // count the number of 'l' -> 3
        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == 'l')
        // count++;
        // }
        // System.out.println("count= "+ count);
        // }

        {
            int max02 = 10;
            int min02 = 1;
            int sum02 = 0;
            // sum up all odd numbers and minus all even numbers

            for (int i = min02; i <= max02; i++) {
                if (i % 2 == 0) {
                    sum02 -= i;
                } else {
                    sum02 += i;
                }
            }
            System.out.println(sum02); // -5 (1 + 3 + 5 + 7 + 9 - 2 - 4 - 6 - 8 - 10)
        }
    }
}
