public class exe181120261 {  // string search in array 1D
     public static void main(String[] args) {
       String []a={"divyan","tom","joy"};
        String target ="divyan";

      for(int i=0;i<a.length;i++){
          if(a[i]==target){
              System.out.println("element found at "+i+" index");
              break;
          }else {
              System.out.println("element not found at any index");
          }
      }
    }
}
