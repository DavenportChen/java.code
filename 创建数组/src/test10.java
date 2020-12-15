/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-10
 * Time: 18:28
 */
import java.util.Arrays;
public class test10 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
            System.out.print(Arrays.toString(arr));
    }
}