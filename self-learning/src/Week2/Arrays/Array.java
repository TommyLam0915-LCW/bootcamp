package Week2.Arrays;

import java.util.Arrays;

public class Array {
    // Declaration of array
    int[] arr;

    // Constructor to initialize arr
    public Array() {
        // Initializing an array with size 10 and all elements set to default value (0)
        arr = new int[10]; // index 0-9
    }

    public static void main(String[] args) {
        // Create an instance of the Array class
        Array array = new Array();

        // Some other ways of initializing an Array
        int[] arr2 = new int[] {1, 2, 3, 5, 7};
        int[] arr3 = {1, 2, 3, 5};

        // Initialzing a 2-dimensional Array
        int[][] arr4 = new int[3][2];
        String[][] arr5 = {{"John", "Lau"}, {"Tommy", "Lam"}, {"Peter", "Lau"}};

        // Get the length of array
        System.out.println(arr2.length);

        // Accessing Elements
        int[] arr6 = new int[] {2, 334, 5656, 21};
        arr6[2] = 99;
        System.out.println(arr6[2]);

        int firstElement = arr6[0];
        int fourthElement = arr6[3];

        // Iterating Over Array Elements

        int[] numbers = {1, 2, 3, 4, 5, 6};

        // Iterating over array elements using a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); // 1,2,3,4,5,6
        }
        // Iterating over an array reversely
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]); // 6,5,4,3,2,1
        }
        // Iterating over 2D-array elements using outer loop and inner loop
        int[][] arr2d = new int[][] {{1, 2, 3}, {1, 2, 3}};
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.println(arr2d[i][j]); // {1,2,3} {1,2,3}
                System.out.println(
                        "row = " + i + "column = " + j + ",val=" + arr2d[i][j]);
            }
        }

        // Declare and initialize a String array
        String[] colorsArray = new String[5];
        colorsArray[0] = "Red";
        colorsArray[1] = "Green";
        colorsArray[2] = "Blue";
        System.out.println("Original Array: " + Arrays.toString(colorsArray));

        // Try to add a new value at the next position of the array
        int numberOfItems = 3;
        colorsArray[numberOfItems] = "Yellow"; // colorsArray[3] = "Yellow"
        System.out.println("Array after adding one element: "
                + Arrays.toString(colorsArray));

        // Searching for an element in an Array
        int[] arr7 = {1, 8, 9, 1, 21, 23, 6, 8};
        int target = 8;
        for (int i = 0; i < arr7.length; i++) {
            if (arr7[i] == target) {
                System.out.println("Found " + target + " at index " + i);
                break;
            }
        } // prints "Found 8 at index 1"


        // Str to Array
        String str = "Hello";

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println("i=" + i + ", char[" + i + "]=" + chars[i]);
        }

        // Find Max
        int[] arr8 = new int[] {1, 2, 3, 6, 5, 4};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr8.length; i++) {
            if (arr8[i] > max) {
                max = arr8[i];
            }
        }
        System.out.println("Max: " + max);

        // Find Min
        int[] arr9 = new int[] {1, 2, 6, 3, 5};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr9.length; ++i) {
            if (arr9[i] < min) {
                min = arr9[i];
            }
        }
        System.out.println("Min: " + min);

        // Swap elements at index 1 and index 2
        int[] arr10 = {1, 2, 3, 4, 5, 12, 14};

        // Swap elements at index 1 and index 2
        int temp = arr10[1];
        arr10[1] = arr10[2];
        arr10[2] = temp;

        // Print the array after swapping
        for (int i = 0; i < arr10.length; i++) {
            System.out.println(arr10[i] + " ");
        }

        // Move the max number to the tail
        int[] nums = new int[] {8, 32, 5, -23, 134};

        // Step1 : Find the index of the max number
        int maxIndex = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > nums[maxIndex]) {
                maxIndex = j;
            }
        }
        // Step2: Swap the max number to the tail
        int temp02 = nums[maxIndex];
        nums[maxIndex] = nums[nums.length - 1];
        nums[nums.length - 1] = temp02;

        System.out.println("Max Index: " + maxIndex);
        System.out.println("After moving max number to the tail: "
                + Arrays.toString(nums));

        // Bubble Sort
        int[] arr11 = {5, 4, 7, 4, 8};

        // Perform bubble sort
        int temp03 = 0;
        for (int i = 0; i < arr11.length - 1; i++) {
            for (int j = 0; j < arr11.length - i - 1; j++) {
                if (arr11[j] > arr11[j + 1]) {
                    // Swap elements
                    temp03 = arr11[j];
                    arr11[j] = arr11[j + 1];
                    arr11[j + 1] = temp03;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr11));

        // Perform insertion sort
        int[] arr12 = {90, 12, 32, 27, 78};

        int key = 0;
        int idx = 0;
        for (int i = 1; i < arr12.length; i++) { // Start from the second element
            key = arr12[i]; // let the current element be "Key"
            idx = i - 1; // the index of the first element to compare (from right to left)
            while (idx >= 0 && arr12[idx] > key) { // Check if the element > key
                arr12[idx + 1] = arr12[idx]; // move the element to right
                idx--;
            } // exit if the key > the left element, and < the right element, then it is the right position to insert
            arr12[++idx] = key; // insert key
        }
        System.out.println("After insertion sort: " + Arrays.toString(arr12));

        // Sorting Array in Descending order
        int[] arr13 = {3, 56, 21, 56, 2, 4, 12, 24};
        int temp04 = 0;
        for (int i = 0; i < arr13.length - 1; i++) {
            for (int j = 0; j < arr13.length - i - 1; j++) {
                if (arr13[j] < arr13[j + 1]) {
                    temp04 = arr13[j];
                    arr13[j] = arr13[j + 1];
                    arr13[j + 1] = temp04;
                }
            }
        }
        System.out.println(
                "Sorted array in descending order: " + Arrays.toString(arr13));

        // Counting Algorithums
        // int[]
        int[] numbers01 = {1, 2, 3, 4, 5, 6, 2, 3, 4, 1, 7};
        int[] countArray = new int[numbers01.length];

        // Count occurences of each number
        for (int i = 0; i < numbers01.length; i++) {
            countArray[numbers01[i]] += 1;
        }

        // Find the maximum count
        int maxCount = 0;
        for (int count : countArray) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println("Maximum count: " + maxCount);

        // Char
        char[] chars01 = new char[] {'a', 'b', 'e', 'g', 'y', 'v', 'v', 'v'};
        int[] count01 = new int[26];
        // store the alphabet as position of the array.
        for (char c : chars01) {
            count01[c - 'a']++;
        }
        // find the alphabet with the max count in counts array.
        int max01 = 0;
        char alphabet = ' ';
        for (int i = 0; i < count01.length; i++) {
            if (count01[i] > max01) {
                max01 = count01[i];
                alphabet = (char) (i + 97);
            }
        }
        System.out.println(alphabet);

        int[] arr14 = new int[10];

        // Filling an Array
        Arrays.fill(arr14, 1);
        System.out.println(Arrays.toString(arr14));

        arr14 = new int[] {1, 3, 6, 21, 13, 8, 2, 97};

        // Copying an Array
        int[] arr15 = Arrays.copyOf(arr14, arr14.length);
        System.out.println(Arrays.toString(arr15));

        // Comparsion for equality
        System.out.println(arr14 == arr15); // false
        System.out.println(Arrays.equals(arr14, arr15)); // true

        //Sorting an Array 
        Arrays.sort(arr15);
        System.out.println(Arrays.toString(arr15)); 

        int[] arr =  {32,87,232,546,12,68,1267,886};
        int target01 = 12;

        int i;
        boolean foundIt = false;

        for(i=0; i<arr.length; i++){
            if (arr[i] == target01){
                foundIt = true;
                break;
            }
        }
        if (foundIt) {
            System.out.println("Found " + target01 + " at index " + i);
        } else {
            System.out.println(target01 + " not in the array");
        }


    }


}


