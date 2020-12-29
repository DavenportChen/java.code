/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-13
 * Time: 15:38
 */
public class test13 {
    public static void findMax(int[] arr) {
        int[] arr = {1,3,2,5,4,7,9};
        for(int i = 0;i < arr.length-1; i ++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] > arr[i]){
                    int tmp = arr[j];
                    arr[j]  = arr[i];
                    arr[i] = tmp;
                }
                System.out.println(arr[i]);
            }
        }
    }
}
