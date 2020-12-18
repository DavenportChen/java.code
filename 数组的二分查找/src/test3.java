import java.sql.SQLOutput;

/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-13
 * Time: 20:45
 */
public class test3 {
    public static int binarySearch(int[] arr,int key) {
        int left = 0;
        int right = arr.length-1;
        while(left <= right ) {
            int mid = (left + right)/2;
            if (key < arr[mid]) {
                right = mid - 1;
            }
            else if (key > arr[mid]) {
                left = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7};
       System.out.println(binarySearch(arr,5));
    }
}
