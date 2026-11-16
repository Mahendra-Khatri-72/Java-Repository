
// in 2d array print the elements all
// 2 34 3 3 34 44 5
// 2 3 4 45 6 7
// 2 3 45
// 2 3 


import java.util.Scanner;

public class exe161120262 {
    public static void main(String[] args) {
        Scanner mr = new Scanner(System.in);

        int arr[][] = {
                { 2, 34, 3, 3, 34, 44, 5 },
                { 2, 3, 4, 45, 6, 7 },
                { 2, 3, 45 },
                { 2, 3 }
        };
        //    int arr[][] = new int[i][j];
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.println("enter value :"+"row ="+ i +"column ="+j );
        //       arr[i][j]=mr.nextInt();
        //     }
        // }

       for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
