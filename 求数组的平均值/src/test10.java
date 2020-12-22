/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-10
 * Time: 19:56
 */
//import java.util.Arrays;
public class test10 {
    public static double avg(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        return sum/(double)arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,12,23,14};
        System.out.println(avg(arr));
    }
}
