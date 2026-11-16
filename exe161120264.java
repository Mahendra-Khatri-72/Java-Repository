// sum in 2d array
public class exe161120264 {
    
    public static void main(String[] args) {
       int arr[][] ={
           {2,3,4},
           {4,5,6},
           {2,34,5}
       };

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            int collength = arr[i].length;
           for(int j=0; j<arr[i].length;j++){
               sum = sum+arr[i][j];
           }
        }
        System.out.println(sum);
    }
}
