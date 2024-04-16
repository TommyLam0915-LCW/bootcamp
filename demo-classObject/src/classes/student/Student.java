package classes.student;

public class Student {

  private String firstName;

  private String lastName;

  private int age = -1;

  //Setter 
  public void setName(String first, String last){
    if (first == null || last == null ||first.length()== 0 || last.length() == 0 ){
      System.out.println("ERROR: Name cannot be empty");
    }else {
      firstName = first;
      lastName = last;
    }
  }
  public void setAge(int a){
    if (a<0){
      System.out.println("ERROR: Age cannot be negative");
    }else{
      a = age;
    }
  }

  //Getter 
  public String getName(){
    if (firstName == null || lastName == null)
      return "unset";
      else 
      return firstName + lastName;
  }
  public int getAge(){
    return age;
  }
}


