import java.util.Scanner;

// class is the blueprint of an object
// example 
// car is a class and it has properties like color, model, etc
// audi, bmw are objects of car class
// create a class 
class Student{
        int rno ;
        String name;
        float marks ;

        // we need a way to create a way to add values of the above properties to the object
        // we need a constructor    

        // we need a key word to create a constructor
       // we need to create a constructor with the same name as class name
       // constructor is a special method
        // this key word is used to create a constructor
        Student(int rno,String name,float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

        Student(){
            // this is how you call a constructor from another constructor 
            // internally : new student(); 
            this(12,"Richie", 98f);
        }

        Student(Student other){
            this.name = other.name; // replace name with other name
        }

        void greeting(){
            System.out.println("hello " + this.name);
        }

        void change_name(String newName){
            this.name = newName;// replace name with other name
            // this keyword is used to refer the current object
        }

        @Override
        public String toString() {
            return "Student{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
            }
        
}

        




public class Main{


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
        // creating new object of student class
        // Student awan = new Student();
        
        // awan.rno = 12;
        // awan.name = "Awan";
        // awan.marks = 90.9f;

        Student awan = new Student(12,"Awan Biswas",90.9f);

        System.out.println(awan.toString());
        
        awan.change_name("Aone");
        Student random  = new Student
        
        ();
        System.out.println(random.toString());

        awan.greeting();
        // System.out.println("awans roll number is " + awan.rno);
        // System.out.println("awans name is " + awan.name);
        // System.out.println("awans marks is " + awan.marks);

        

    
    }
  

}

