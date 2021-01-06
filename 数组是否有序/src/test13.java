/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-13
 * Time: 20:17
 */
public class test13 {
    public static boolean isSort(int[] arr) {
       for(int i = 0; i < arr.length-1; i++){
           if(arr[i] > arr[i+1]){
               return false;
           }
       }
       return true;
    }

public static void main(String[] args) {
        int[] arr = {11,9,3,4,5,6,7,8};
        System.out.println(isSort(arr));
    }
}
