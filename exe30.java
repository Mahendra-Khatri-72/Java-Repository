// wrute a java program to perform contructor overloading and method overloading in a single program
 class Student{
       String Name;
       int rollNo;
      int age;

                  
    Student( String x, int y, int z){  // constructor
        this.Name = x;
        this.rollNo = y;
        this.age = z;
    }

       void display(){
        System.out.println("Name: " + Name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
       }
        
    }

public class exe30 {

  
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, 20);
        s1.display();
   

    }
}
