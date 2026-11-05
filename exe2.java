// Ques 2 . largest of 3 no. using neasted if/else ?

import java.util.Scanner;
public class exe2 {
    public static void main(String[] args){
 Scanner mr = new Scanner(System.in);
 System.out.print("Enter three numbers: ");
 System.out.print("ENTER VALUE A: ");
 int a = mr.nextInt();
 System.out.print("ENTER VALUE B: ");
 int b = mr.nextInt();
 System.out.print("ENTER VALUE C: ");
 int c = mr.nextInt();

 if (a > b && a > c) {
     System.out.println(a + " is the largest number.");
 } else if (b > a && b > c) {
     System.out.println(b + " is the largest number.");
 } else {
     System.out.println(c + " is the largest number.");
 }
    }
}
