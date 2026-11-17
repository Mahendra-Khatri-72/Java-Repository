// liner search in array 1D

// public class exe17112021 {
//     public static void main(String[] args) {

//         int arr[] = { 23, 4, 32, 1, 4454, 5,  5 };
//         int target = 7;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 System.out.println("value is find at :" + i + " index");
//             }else{
//                 System.out.println("element is not found at index "+i);
//             }
//         }
//     }

// }

//  temp using linear search in 1D array

public class exe171120261 {
    public static void main(String[] args) {

        int arr[] = { 23, 4, 32, 1, 4454, 5,  5 };
        int target = 7;
int temp =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("value is find at :" + i + " index");
                temp = temp+1;
            }
        }
        if(temp==0){
            System.out.println("element is not found at any index");
        }
    }

}