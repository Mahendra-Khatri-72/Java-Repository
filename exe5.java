import java.util.Scanner;
public class exe5 {
    public static void main(String[] args) {
        Scanner mr = new Scanner(System.in);

        int n = mr.nextInt();
   int i=2;
        do {
            if (n % i == 0) {
                System.out.println("not prime");
                break;
            }
            i++;
        
           
        } while (i < n);

        if (i == n) {
            System.out.println("prime");
        }
    }
}
