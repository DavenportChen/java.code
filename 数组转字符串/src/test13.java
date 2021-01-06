/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-13
 * Time: 21:45
 */
public class test13 {
    public static String toString(int[] arr) {
        String ret = "[";
        for(int i = 0; i < arr.length; i++){
            ret +=arr[i];
            if(i != arr.length - 1){
                ret +=",";
            }
        }
        ret += "]";
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(toString(arr));
    }
}
