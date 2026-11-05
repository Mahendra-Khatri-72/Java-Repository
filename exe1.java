// Question 1: Write a program using below condition statement 
// Ques 1. even and odd number using if else statement.
// Ques 2 . largest of 3 no. using neasted if/else ?
// Ques 3. using if /else lader root of quadratic equation.

import java.util.Scanner;
public class exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even number");
        } else {
            System.out.println(n + " is odd number");
        }
   
      
      
}
}