package com.awan.introduction;
import java.util.Scanner;



public class DAY_1{


    public static void main(String[] args) {
        // Store 5 roll number in an array 
        // int[] roll numbers = new int[5];

        //Store 5 names
        // String[] names = new String[5];

        // data of 5 nstudents {rno, name, marks} 
        // int rno = new int[5];
        // String name = new String[5];
        // float[ ] marks = new float[5];

        // now create a data type students 
        //objects
        //physical instance of student class
        // state of the object - value of the object
        // behaviour of object - effect of data type operations
        // identity of object - different from one object to another
        Student awan = new Student();

        awan.rno = 12;
        awan.name = "Awan";
        awan.marks = 90.9f;

        System.out.println("awans roll number is " + awan.rno);
        System.out.println("awans name is " + awan.name);
        System.out.println("awans marks is " + awan.marks);

        // now store the data instudent array


    
    }
  

}

// class is the blueprint of an object
// example 
// car is a class and it has properties like color, model, etc
// audi, bmw are objects of car class
// create a class 
class Student{
        int rno ;
        String name;
        float marks ;

    }