package Week2.Loop2;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        // Using for-each loop to iterate over elements of the int array
        for (int number : numbers) {
            System.out.println(number);
        }

        String[] names = {"Alice", "Bob", "Charlie", "Tommy"};
        // Using for-each loop to iterate over elements of the string array
        for (String name : names) {
            System.out.println(name);
        }

        String str = "Hello,World!";
        String[] parts = str.split(",");

        for (String part : parts) {
            System.out.println(part);
        }

        String str01 = "apple,banana,cherry,date";
        String[] fruits = str01.split(",\\s*");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        String str02 = "one, two, three, four , five";
        String[] parts01 = str02.split(" , ", 3);

        for (String parts02 : parts01) {
            System.out.println(parts02);
        }

        // Simple while loop
        int count = 0;

        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // With logical operator
        int num = 1;
        while (num >= 1 && num <= 5) {
            System.out.println("Number" + num);
            num++;
        }

        // With Break statement
        int num02 = 0;
        while (true) {
            System.out.println("Number: " + num02);
            num02++;
            if (num02 == 5) {
                break; // Terminates the loop when num reaches 5
            }
        }

        // With continue statement
        int num03 = 0;
        while (num03 < 5) {
            num03++;
            if (num03 == 3) {
                continue; // Skip the current iteration when num is 3
            }
            System.out.println("Number: " + num03);
        }

        // Simple Do-while Loop
        int count01 = 0;
        do {
            System.out.println("Count: " + count01);
            count01++;
        } while (count01 < 5);

        //With User Input
        int number01;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a positive number");
            number01 = scanner.nextInt();
        } while (number01 <= 0);
        System.out.println("You entered a positive number");

        // With break statement
        int count02 = 0;

        do {
            if (count02 == 3) {
                break; // Terminates the loop when count is 3
            }
            System.out.println("Count: " + count02);
            count02++;
        } while (count02 < 5);


        // With continue statement 
        int count03 =0;

        do{
          count03 ++;
          if (count03%2 ==0){
            continue; //Skips the current iteration when count is even 
          }
          System.out.println("Count " + count03);
        } while(count<5);
    }
}
