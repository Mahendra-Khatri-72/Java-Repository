public class exee7 { // 26/10/2026
    public static void main(String[] args) {
        int arr[] = { 90, 80, 70, 60, 50 };

        int key = 70;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            if (arr[i] == key) {
                
             System.out.println("Element found at index: " + i);
                break;

            }
        }

        System.out.println("-------------------------------------------------------");
  
  
    //    continue statement

    System.out.println("continue statement");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                continue;
            }
            System.out.println(arr[i]);
        }
  
    }

}
