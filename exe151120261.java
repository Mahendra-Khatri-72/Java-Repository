// maximum value in an array 1d
public class exe151120261 {
     public static void main(String[] args) {

        int arr[] = {2,3,4,56,6,8};
        int maxValue = arr[0]; // let

        for(int i=0;i<arr.length;i++){
            // condition
            if(arr[i]>maxValue){
                maxValue = arr[i];
                
            }
           
        }
         System.out.println(maxValue);
    }
}
