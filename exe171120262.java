// min value in 2d array
public class exe171120262 {
    public static void main(String[]args){

         int arr[][] = {{2,34,5},{1,23,4}};
         int minValue = arr[0][0];

         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                // condition
                if(arr[i][j]<minValue){
                    minValue =arr[i][j];
                }
            }
         }
         System.out.println(minValue);
    }
}
