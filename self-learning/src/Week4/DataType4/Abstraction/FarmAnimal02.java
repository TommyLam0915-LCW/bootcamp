package Week4.DataType4.Abstraction;

public interface FarmAnimal02  extends Animal02, SustainLife{
  String FARM_ANIMAL_NAME_PREFIX = "Old McDonald"; // implicitly static final

  void makeSound();

  default void sleep(){
    System.out.println("Zzzzzzzzz");
  }

  static boolean isNameValid (String name){
    return name.startsWith(FARM_ANIMAL_NAME_PREFIX);
  }
}
