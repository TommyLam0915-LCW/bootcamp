package com.bootcamp.demo2403;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

// Getter/ Setter is a field / class level annotation

@AllArgsConstructor
public class Student {
  @Getter 
  private String name;
  @Setter
  private int age;

  public static void main(String[] args) {
    Student s1 = new Student("Vincent", 4);
    System.out.println(s1.getName());

    s1.setAge(5);

    Student s2 = new Student("Sam");
  }
}
