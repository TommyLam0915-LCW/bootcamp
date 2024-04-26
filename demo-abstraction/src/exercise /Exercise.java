package exercise ;

//Class cannot extend multiple Parent class
// but interface can extend multiple interfaces 
public interface Exercise extends Run, Walk {
  void swim();
}
