// in 2d array total product of all elements
public class exe161120263 {
    public static void main(String[]args){
       
        int arr[][]= {{2,3,4},{2,3,4}};
 
         int product =1;

         for(int i=0;i<arr.length;i++){
            // columns
            for(int j=0;j<arr[i].length;j++){
                product = product * arr[i][j];
            }
         }
         System.out.println(product);

    }
}
