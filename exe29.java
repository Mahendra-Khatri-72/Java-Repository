

class Student{
    int rollNo;
    String Name;

    // --------------------------------------------
                //  parameterized constructor
    Student(int x , String y){  // constructor
        this.rollNo = x;
        this.Name = y;
    }

    // --------------------------
//  non-parameterized constructor
    Student(){
        this.rollNo = 0;
        this.Name = "No name";
    }

  
}

public class exe29 {
    public static  void main(String[] args){

Student s1 = new Student(21, "BOB");      // 21,bob are arguments
          System.out.println("s1.rollNo: " + s1.rollNo);
        System.out.println("s1.Name: " + s1.Name);

        // --------------------------------------------------
        Student s2 = new Student();
        System.out.println("s2.rollNo: " + s2.rollNo);
        System.out.println("s2.Name: " + s2.Name);
// ---------------------------------------------------
// default constructor
        Student s3 = new Student();
        System.out.println("s3.rollNo: " + s3.rollNo);
        System.out.println("s3.Name: " + s3.Name);
    }
}

// TYPES OF CONSTRUCTOR
// 1. default constructor  -> student s1 = new Student();  // default constructor
// 2. parameterized constructor  -> student s1 = new Student(21, "BOB");  // parameterized constructor
// 3. NON-PARAMETERIZED CONSTRUCTOR  -> student s1 = new Student();  // non-parameterized constructor
// this keyword is used to refer to the current object of a class. It is used to differentiate between instance variables and local variables when they have the same name.
// constructor overloading is a technique in Java where a class can have multiple constructors with different parameter lists. This allows for different ways of initializing objects of the class.