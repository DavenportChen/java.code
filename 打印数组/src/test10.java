/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-10
 * Time: 18:42
 */
public class test10 {
    public static void PrintArray(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        PrintArray(arr);
    }
}
