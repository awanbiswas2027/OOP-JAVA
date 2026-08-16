public class DAY_2_WrapperExample {

    public static void main(String[] args) {

        // Wrapper class
        // int is a primitive data type
        int k = 10;

        // Integer is the wrapper class for int
        // It allows us to use an int value as an object
        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        swap(a, b);

        System.out.println("After calling swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // The swap happens inside the swap method
        // But the original a and b in main do not change
        // Java is pass-by-value
        // The method receives copies of the values
        // Changing the local variables does not change the original variables


        // final with primitive

        final int BONUS = 10;

        System.out.println("Bonus = " + BONUS);

        // This is not allowed because BONUS is final
        // BONUS = 20;


        // final with object reference

        final A awan = new A("Awan");

        System.out.println("Name = " + awan.name);

        // final prevents the reference from being reassigned
        // awan = new A("Rahul"); // ERROR

        // But the object's internal state can still be changed
        // because name is not final
        awan.name = "New Name";

        System.out.println("Updated name = " + awan.name);


        // Reference variables

        A student1 = new A("Student 1");

        // This does not create a new object
        // student2 points to the same object as student1
        A student2 = student1;

        System.out.println("student1 = " + student1.name);
        System.out.println("student2 = " + student2.name);

        // Changing the object through student2
        // also changes what student1 sees
        student2.name = "Changed Name";

        System.out.println("After changing student2:");
        System.out.println("student1 = " + student1.name);
        System.out.println("student2 = " + student2.name);


        // Garbage collection

        A obj = new A("Temporary Object");

        // Removing this reference does not immediately destroy the object
        // If no other reference points to the object,
        // it becomes eligible for garbage collection
        obj = null;

        System.out.println("Object is eligible for garbage collection");

        // The JVM decides when garbage collection actually happens
        // We cannot control the exact time when the object is destroyed


        // Creating multiple objects

        A random;

        // Every new A() creates a new object
        // This loop creates 100 objects
        for (int i = 0; i < 100; i++) {
            random = new A("Random name");
            System.out.println("100 objects were created");

        }

        // obj.finalize();



        // Older Java programs sometimes used finalize()
        // to perform cleanup before an object was reclaimed
        // finalize() is deprecated in modern Java
        // We should not depend on finalize() for cleanup
    }


    static void swap(Integer a, Integer b) {

        System.out.println("Inside swap before:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Integer temp = a;
        a = b;
        b = temp;

        System.out.println("Inside swap after:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // The values are swapped inside this method
        // But these are local copies
        // The original a and b in main remain unchanged
    }
}


class A {

    // final means this value cannot be reassigned
    final int num = 10;

    // This is a normal instance variable
    String name;

    // Constructor
    public A(String name) {

        System.out.println("Object created");

        // this.name refers to the instance variable
        // name refers to the constructor parameter
        this.name = name;
    }
    // @Override
    // protect void finalize() throws Throwable{
    //         System.out.println("object is destroyed!");
    //     }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("object is destroyed!");
    }
}