

    // to find minValue in ARRAY 1D
import java.util.Scanner;
public class exe151120262 {
   public static void main(String args[]){
       Scanner mr = new Scanner(System.in);
       int arr[] = new int [5];
       // taking input from the user 
       for (int i=0;i<arr.length;i++){
           System.out.println("enter refrence value at index :"+ i);
           arr[i]=mr.nextInt();
       }

       int minValue =arr[0];

       for(int i=0;i<arr.length;i++){
           // condition
           if(arr[i]<minValue){
               minValue= arr[i];
           }
       }
       System.out.println("---------------------------");
       System.out.println("MINIMUM VALUE COMPARE TO ALL ELEMENT ="+minValue);
   }
}

