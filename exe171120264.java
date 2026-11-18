// linear search in array 1d string 
public class exe171120264 {
    public static void main(String[] args) {

        String arr[] = { "bob", "tom", "buddy", "joy" };
        String target = "buddy";
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                System.out.println("element found at index :" + i);
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("element is not found at any index");
        }
    }
}
