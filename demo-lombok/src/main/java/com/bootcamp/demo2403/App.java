package com.bootcamp.demo2403;

import java.util.ArrayList;
import java.util.List;

// java.lang 
// Create Java project -> JDK (java.lang)
// but you need to explicity import java.util, etc

// Command "mvn compile" -> check dependnecy in pom.xml -> download dependency 
// Jva project = JDK + junit + lombok 
// target foler -> generated main + test class file (similar to javac)
// Command "mvn clean" -> clear targets foler;

//Commoand "mvn clean compile" clear target foler 

//Command ""

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        StringBuilder sb = new StringBuilder();
        int x = (int) Math.pow(2.0,2.0);

        Cat cot = new Cat("Vincent", 13);
        List<String> s = new ArrayList<>();

        
    }
}
