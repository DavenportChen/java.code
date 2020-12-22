/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-14
 * Time: 21:47
 */
import java.util.Scanner;
public class Test14 {
    public static int fib (int n) {
        if (n <= 2) {
            return 1;
        }
        else {
            return fib(n - 1) + fib (n - 2);
        }
    }

    public static void main (String[] args) {
        System.out.println("请输入项数:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(fib(a));
    }
}


