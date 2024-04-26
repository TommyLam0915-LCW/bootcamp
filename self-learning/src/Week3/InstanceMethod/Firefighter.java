package Week3.InstanceMethod;

public class Firefighter extends People {
  // the firefighter subclass has one field
  private int hoursOfTraining;

  // the firefighter subclass has one constructor
  public Firefighter(String name, int age, int weight, int height,
      int hoursOfTraining) {
    // super method
    // Constructor of parent class: public People(String name, int age, int height, int weight)
    super(name, age, height, weight);
    this.hoursOfTraining = hoursOfTraining;
  }

  // the Firefighter subclass has one method
  public void setHoursOfTraining(int hoursOfTraining) {
    this.hoursOfTraining = hoursOfTraining;
  }

  public int getHoursOfTraining() {
    return this.hoursOfTraining;
  }

  public static void main(String[] args) {
    Firefighter f1 = new Firefighter("John", 22, 180, 70, 60);

    System.out.println(f1.getHoursOfTraining());
  }
}


