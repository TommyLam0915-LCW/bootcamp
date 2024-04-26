package src.Cat;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal {
  
  public static void addCat(List<? super Cat> cats){ //Cat or above 
    cats.add(new Cat());
    cats.add(new Animal());
    cats.add(new RedCat());

  }

  public static void addCat2 (List<Cat> animals){

  } 
  public static void main(String[] args) {
    addCat(new ArrayList<>(List.of(new Animal(), new Animal())));
    addCat(new ArrayList<>(List.of(new Cat(), new Cat())));
    addCat(new ArrayList<>(List.of(new RedCat(), new RedCat())));

    // addCat2(new ArrayList<>(List.of(new Animal(), new Animal()))); 
    addCat2(new ArrayList<>(List.of(new Cat(), new Cat())));
    addCat2(new ArrayList<>(List.of(new RedCat(), new RedCat())));
  }
}
