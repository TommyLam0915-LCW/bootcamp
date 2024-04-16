package classes.student;

public class Test {
  public static void main(String[] args) {

    Student s1 = new Student();
    s1.setName("小木", "");
    s1.setAge(-500);
    System.out.println(s1.getName());
    System.out.println(s1.getAge());

    Student s2 = new Student();
    s2.setName("Tina", "Lee");
    s2.setAge(18);
    System.out.println(s2.getName());
    System.out.println(s2.getAge());

  }// end of main(String[])
}// end of class Test
