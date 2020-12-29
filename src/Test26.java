/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-26
 * Time: 14:13
 */
import java. util.Arrays;
public class Test26 {
    public static void func(int [] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            if(arr[left]%2 == 0 ) {
                left ++;
            } else if(arr[right]%2 != 0 ) {
                right --;
            } else {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        func(arr);
        System.out.println(Arrays.toString(arr));
    }
}
