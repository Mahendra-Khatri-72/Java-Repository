import java.util.Scanner;

public class exe181120262 { //linear search in 2D array string
    public static void main(String[] args) {
        Scanner mr = new Scanner(System.in);
        String[][] a = {
                { "joy", "tom", "X" },
                { "y", "bunny", "roy" },
                { "buddy", "jay" }

        };
        // print array
        System.out.println("your String element are :");
        for (int i = 0; i < a.length; i++) {
            int collength = a[i].length - 1;
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        System.out.print("select element to search = ");
        String target = mr.next();
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j].equals(target)) {
                    System.out.println("element found at row = " + i + " column = " + j);
                    temp = temp + 1;
                }
            }

        }
        if (temp == 0) {
            System.out.println("element not found at any index");
        }
    }
}
