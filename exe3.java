// Ques 3. using if /else lader root of quadratic equation.


public class exe3 {
    public static void main(String[]args){
        
        int a=1;
        int b=5;
        int c=6;

        int d=(b*b)-(4*a*c);
        if(d>0){
            System.out.println("roots are real and different");
        }
        else if(d==0){
            System.out.println("roots are real and same");
        }
        else{
            System.out.println("roots are imaginary");
        }
    }
}
