
// constructor overloading


class Student{
    int rollNo;
    String Name;
    int age;
Student (int x , String y){  // constructor   s1
        this.rollNo = x;
        this.Name = y;
    }

    Student(int rollnum , String name , int age){  // constructor   s2
        this.rollNo = rollnum;
        this.Name = name;
        this.age = age;
    }


Student(int rollnumber){                // constructor   s3
        this.rollNo = rollnumber;
    }

    void display(){               // method to display the values of the object
   System.out.println("Roll No: " + rollNo);
   System.out.println("Name: " + Name);
   System.out.println("Age: " + age);
    }
}



public class exee29 {
    public static void main(String[] args) {
   Student s1 = new Student(21, "boob");
   Student s2 = new Student(22, "bob", 20);
   Student s3 = new Student(23);    
    
  s1.display();        // displays values of s1
//   s2.display();        // displays values of s2
//   s3.display();        // displays values of s3
// }
}}
