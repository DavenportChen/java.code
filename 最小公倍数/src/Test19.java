/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-19
 * Time: 17:05
 */
import java.util.Scanner;
public class Test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ret = a % b;
        if(ret == 0) {
            System.out.println(a);
        } else {
            int key = minBeiShu(a, b);
            int result = a * b / key;
            System.out.println(result);
        }
    }

    public static int minBeiShu(int a, int b) {
        int m = a % b;
        while (m != 0) {
            a = b;
            b = m;
            m = a % b;
        }
        return b;

    }
}
