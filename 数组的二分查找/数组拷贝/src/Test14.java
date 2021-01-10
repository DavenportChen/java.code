/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-14
 * Time: 19:13
 */
//package gyy;
import java.util.Arrays;
public class Test14 {
    public static int[] copyOf(int[] arr) {
        int[] ret = new int[arr.length];
        for(int i = 0; i < arr.length; i ++){
            ret[i] = arr[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ret = copyOf(arr);
        System.out.println(Arrays.toString(ret));
    }
}