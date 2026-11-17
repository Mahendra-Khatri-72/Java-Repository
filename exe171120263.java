// max value find out in 2D array

public class exe171120263 {

    public static void main(String[] args) {
        int arr[][] = {
                { 2, 3, 4 },
                { 4, 5, 6 },
                { 2, 34, 5 }
        };

        int maxValue = arr[0][0]; // let
        for (int i = 0; i < arr.length; i++) {
            int collength = arr[i].length;
            for (int j = 0; j < arr[i].length; j++) {
                // condition
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                }

            }

        }
        System.out.println(maxValue);
    }
}
