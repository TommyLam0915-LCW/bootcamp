package com.bootcamp.demo2403;

public class Cat {
  private String name;
  private int age;

  public Cat(String name, int age){
    if (name = null){
      
    }
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public static void main(String[] args) {
    Cat cat = new Cat("Tommy", 10);
  }

}
