package Week4.DataType4.TopmostClassObject.HashCode;
import java.util.Objects;

public class Student {
  private String id;
  private String name;

  public Student(String id , String name){
    this.id = id;
    this.name = name;
  }
  //implicitly inherit the hashcode() method form Object.class

  @Override // Overwrite the hashCode() in Object.class
  public int hashCode(){
    return Objects.hash(this.id);
  }
}
