public class DemoString{
  public static void main(String[] args){
    String s ="hello";
    String s2 = "";
    String s3 = " ";
    String s4 = "   ";

    //isEmpty() vs isBlank()
    boolean isEmptyResult = s2.isEmpty(); //true 
    System.out.println(isEmptyResult);

    System.out.println(s.isEmpty()); //false
    System.out.println(s3.isEmpty()); //false 

    System.out.println(s.isBlank()); //false 
    System.out.println(s2.isBlank()); //true
    System.out.println(s3.isBlank()); //true (different)

    System.out.println(s3.isEmpty()); //false
    System.out.println(s3.isBlank()); //true 

    //Substring
    String result = s.substring(0,3); //hel
    System.out.println(result);

    result=s.substring(2);
    System.out.println(result); //llo 

    //lowercase()
    System.out.println("HELlo".toLowerCase()); //hello
    //uppercase()
    System.out.println("HELlo".toUpperCase()); //HELLO

    //contains 
    System.out.println(s.contains("ll")); //true

    //startsWith()
    System.out.println(s.startsWith("he")); //true 
    //endsWith()
    System.out.println(s.endsWith("lo")); //true

    //replace()
    String after = s.replace("l","z");
    System.out.println(after); //hezzo

    //trim() -> remove the space at the begining and the tail of the string 
    String s5 = "  hello ! world  ";
    System.out.println(s5.trim()); //"hello  ! world"
    System.out.println(s5.replace(" ","")); //remove all spaces

    //indexof()
    char c = s.charAt(2); //'l'
    System.out.println(s.indexOf('l')); //2 -> the index of the first matching character
    System.out.println(s.indexOf('l')); //-1



  }
}