// print element in 2d array (same no.of row and column )
public class exe161120261 {
    public static void main(String[] args) {

        int arr[][] = {
                { 2, 3, 4 },
                { 5, 6, 7 },
                { 5, 6, 7 }
        };
        // System.out.println(arr[0][0]); // for particular element
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

// failed when the columns are not same as rows
// in 2d array print the elements all
// 2 34 3 3 34 44 5
// 2 3 4 45 6 7
// 2 3 45
// 2 3

// for this
// int collength = arr[i].length;