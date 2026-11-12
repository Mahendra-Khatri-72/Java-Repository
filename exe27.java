

//  no perameter , no argument

// public class exe27 {
//     public void add(){
//         int a = 10;
//         int b = 12;
//         System.out.println(a+b);
//     }

//     public static void main(String[] args) {
//         exe27 obj = new exe27();
//         obj.add();
//     }
// }


//---------------------------------------------
// return type without prameter
// public class exe27 {
//     public int add(){
//         int a = 10;
//         int b = 12;
//         System.out.println(a+b);
//         return a+b;
//     }

//     public static void main(String[] args) {
//         exe27 obj = new exe27();
//        int result = obj.add();
//        System.out.println("Result: " + result);
//     }
// }



// -----------------------------------------------
// without return type with parameter

// public class exe27 {
//     public void add(int a, int b){// parameters                     {void fn me return nahi hota hia print karte hai}
//         System.out.println(a+b);
//     }

//     public static void main(String[] args) {
//         exe27 obj = new exe27();
//         obj.add(10, 12);    {arguments}
//     }
// }




// =====================================
// return type with parameter
// public class exe27{
//  public int add(int a, int b){
//         System.out.println(a+b);
//         return a+b;
//     }

//     public static void main(String[] args) {
//         exe27 obj = new exe27();
//        int result = obj.add(10, 12);
//        System.out.println("Result: " + result);
//     }
// }

// ----------------------------------------------

// ek function ke andar dusre function ko call karna
// public class exe27{
//     public int add(int a, int b){
//         System.out.println(a+b);
//         return a+b;
//     }

//     public void display(){
//         System.out.println("This is display method");
//     }

//     public static void main(String[] args) {
//         exe27 obj = new exe27();
//         int result = obj.add(10, 12);
//         System.out.println("Result: " + result);
//         obj.display();
//     }
// }

//  same name but different parameter
// public class exe27{
//     public int add(int a, int b){
//         System.out.println(a+b);
//         return a+b;
//     }

//     public int add(int a, int b, int c){
//         System.out.println(a+b+c);
//         return a+b+c;
//     }

//     public static void main(String[] args) {
//         exe27 obj = new exe27();
//         int result1 = obj.add(10, 12);
//         System.out.println("Result: " + result1);

//         int result2 = obj.add(10, 12, 15);
//         System.out.println("Result: " + result2);
//     }
// }

// -----------------------------------------------

public class exe27{
    public static void main(String[] args){
        
    }
}