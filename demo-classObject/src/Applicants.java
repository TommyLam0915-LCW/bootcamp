public class Applicants {

  private String Name;

  private String SchoolNumber; 

  private int StudyYears; 

  public void setName(String Name){
    this.Name = Name; 
  }
  public void setSchoolNumber(String SchoolNumber){
    this.SchoolNumber = SchoolNumber;
  }
  public void setStudyYears(int StudyYears){
    this.StudyYears = StudyYears; 
  }

  public String toString() {
    return "Applicants(" //
    +"Name= " + this.Name // 
    + "SchoolNumber= " + this.SchoolNumber //
    + "StudyYears= " + this.StudyYears //
    + ")";
  }

  public static void main (String[] args){
    Applicants applicants = new Applicants();
    applicants.setName("Tommy");
    applicants.setSchoolNumber ("a1234567");
    applicants.setStudyYears(3);
    System.out.println(applicants.toString()); 
  }

}
