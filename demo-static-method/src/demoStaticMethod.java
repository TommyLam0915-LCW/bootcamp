public class demoStaticMethod {
    // Static method
    // void is a return type, representing it should not return anything
//     public static void main(String[] args) {

//         System.out.println("hello");
//         // 1+3 = ?
//         // 2+5 = ?
//         int result = 1 + 3;
//         int result2 = 2 + 5;

//         // call method
//         result = sum(1, 3);
//         result = sum(2, 5);

//         sum(1.3, 1.4);
//         System.out.println(sum("1", "3"));// 4

//         Integer m = 3; // autobox
//         Integer n = 4; // autobox
//         if (m > n) { // wrong (concept)

//         }
//         if (m.compareTo(n) > 0) { // check if m > n
//         }
//         // radius -> circle area
//         double area = area(3.2d);
//         double area2 = area("Circle", 3.2d);
//         double area3 = area("Square", 3.2d);
//         double area4 = calculate("Circle", "perimeter", 3.2d);
//         double area5 = calculate("Square", "perimeter", 3.2d);

//         // Adult

//         double pi = Math.PI; // 3.14
//     }


//     // Static method
//     // "sum" is a method name
//     // "(int x, int y)" is declaration of input parameters for methods
//     // "int" is also a return type
//     // Keyword "return" : for all non-void scenario
//     public static int sum(int x, int y) {
//         int z = x + y;
//         return z;
//     }

//     // substraction
//     public static int sub(int x, int y) {
//         // int z = x - y;
//         return x - y; // int value - int value -> int value
//     }

//     // Method Definition: Method Name + Input Parameters (type & no.of parameter)
//     public static int sum2(double x, double y) {
//         return (int) (x + y); // double value + double value -> double value
//     }

//     // valueOf
//     public static int sum(String x, String y) {
//         // Integer z = Integer.valueOf(x) + Integer.valueOf(y); // convert String to Integer
//         // Integer object > int value
//         return Integer.valueOf(x) + Integer.valueOf(y); // Integer + Integer -> int + int -> int
//     }

//     // radius
//     public static double circleArea(double radius) {
//         return radius * radius * Math.PI; // bug
//     }
// }

// public static double calculate(String type, double parameter, double x) {
// // if (...) return different formula
// if ("Circle".equals(type)) {
// return x * x * Math.PI;
// } if ("area".equals(parameter)){
// return x * x * Math.PI;
// }else if ("perimeter".equals(parameter)){
// return 2 * x * Math.PI;
// }
// else if ("Square".equals(type)) {
// return x * x;
// } if ("area".equals(parameter)){
// return x * x;
// } else if ("parameter".equals(parameter)){
// return 4 * x;
// }
// return -1.0;
// }

    //  public static double calculate(String shape, double target, double x) {
    //      if ("area".equals (target)){
    //          if ("Circle".equals(shape)){
    //             return Math.pow(x,2)*Math.PI;
    //         }else if ("Square".equals(shape)){
    //             return Math.pow(x,2);
    //         }else if ("parameter".equals(target)){
    //             if("Circle".equals(shape)){
    //                 return x * 2 *Math.PI;
    //             } else if ("Square".equals(shape)){
    //                 return 4 * x;
    //             }
    //             return -1.0;
    //         }
            int age = 18;
            boolean isAdult = isAdult(age);
            public static boolean isAdult(int age){
                //Approach 1: 
                // if (age >= 18)
                //     return true; 
                // return false;

                //Approach 2:
                return age >= 18? true : false;
        }       
    }
