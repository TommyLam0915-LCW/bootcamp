public class DataType {
  public static void main(String[] args) {
    // Variable
    // Integer
    int x = 3;
    int age = 18;
    System.out.println(x); // 1200
    x = 200;
    System.out.println("x"); // string x
    System.out.println(x); // 200

    int y = -20;
    y = 100;

    // x , y , age
    int sum = x + y + age;
    System.out.println(sum); // 318

    int price = 8;
    int quantity = 10;
    int total = price * quantity;

    System.out.println(total); // 80

    int price2 = 10;
    int quantity2 = 4;
    int total2 = price2 * quantity2;

    System.out.println(total2);// 40

    // CamlCase
    int averagePrice = (total + total2) / (quantity + quantity2);// 120 / 14 = ~8.57
    System.out.println(averagePrice); // 8

    int a = 1;
    int b = 4;
    int c = a / b; // 0.25 -> 0
    System.out.println(c);

    double k = 1.3;
    double k2 = 1.32;
    double k3 = 1;
    double k4 = -100;
    double k5 = 1.3213221313123131231;

    double k6 = 0.1 + 0.2; // 0.3
    System.out.println(k6);// 0.30000000004

    double k7 = 0.2 + 0.3; // 0.5
    System.out.println(k7); // 0.5

    int u = 10 % 3; // 1
    System.out.println(u); // 1

    // int h; // declaration
    // System.out.println(h); // error
    int h = 10; // initialization
    System.out.println(h);

    // Compile time vs Run time

    byte b1 = 10;
    byte b2 = 127;
    // byte b3 = 128; // compile time error (byte : [-128, 127])
    byte b4 = -128;
    // byte b5 = -129;

    short c1 = 32767;
    // short c2 = 32768; // compile time error (short : [-32768, 32767])
    short c3 = -32768;
    // short c4 = -32769;

    // Conversion
    int i1 = 100;
    long l1 = i1 + 100; // i1 +100 -> int vlaue -> long value
    System.out.println(l1); // 200

    // Java ensures type security (cannot converse from greater size to smaller size )
    // short s4 = i1; // 100

    double d3 = i1; // int -> double (OK)
    double d4 = 10.2;
    // i1 = d4; //double -> int (NOT OK)

    float f3 = i1; // int -> flaot (OK)
    float f4 = 10.2f; // 10.2 is a double value by default (same value to the preious value )
    // i1 = f4; //flaot -> int (NOT OK)

    double d5 = 10.4; // 10.4 is a double value by default
    double d6 = 10.4d; // you explicitly assigned a double value

    int r1 = 10; // 10 is a int value by default
    // byte b10 = 4; // for interger, java will help check the value, if it is in range. int -> byte
    // byte b12 = r1; // security

    long l4 = i1; // int -> long
    long l5 = 5; // 5 is an int value by default
    // long l6 = 5i;
    long l6 = 10000; // 10000 is an int value
    long l7 = 10000L; // 10000 is a long value

    // long l8 = 2200000000; //out of range (int)
    long l9 = 2200000000L; // From int to long

    double d10 = 100f + 10L;
    System.out.println(d10);

    // char
    char e1 = 'a';
    char e2 = '0';
    char e3 = '*';
    char e4 = ' ';
    // char e5;
    // c5=''; // compile time error
    // char c6 = 'aa'; // allow single character only

    // boolean
    boolean b9 = true;
    boolean b12 = false;
    // boolean b13 = 'a';
    // boolean b14 = 10;

    // keyword
    // int true = 10; //NOT OK
    // int int = 11; //NOT OK
    // int long = 12; //NOT OK
    // int class =13; //NOT OK
    // int public = 14; //NOT OK

    // int h1 = 10 + 300L; //int value + long value -> 310 long value. long -> int (error)
    long h2 = 10 + 300L; // int value + long value -> 310 long value. long -> long

  }
}
