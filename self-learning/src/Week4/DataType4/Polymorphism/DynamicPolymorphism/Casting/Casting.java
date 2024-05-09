package Week4.DataType4.Polymorphism.DynamicPolymorphism.Casting;

public class Casting {
    static int i1 = 1;
    static long i2 = i1; // type promotion, no need to specify the target type in parentheses
    static int i3 = (int) i2; // type casting, narrowing conversion
    static int i4 = Integer.MAX_VALUE;
    static long i5 = i4 + 1; // i) add two integers -> overflow of integer, 
    //ii) store the overflow value to long
    static long i6 = ((long) i4) + 1; // i) cast an int to a long, 
    //ii) add 1 and store in long
    static int i7 = (int) i6; //cast a bigger type to a smaller type

    public static void main(String[] args) {
        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("i4: " + i4);
        System.out.println("i5: " + i5);
        System.out.println("i6: " + i6);
        System.out.println("i7: " + i7);
    }
}
/*
 Output:
i1: 1
i2: 1
i3: 1
i4: 2147483647
i5: -2147483648
i6: 2147483648
i7: -2147483648
 */

