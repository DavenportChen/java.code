/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-06
 * Time: 20:46
 */
import java.util.Scanner;
public class test6 {
    public static void print(int n) {
        if (n < 0) {//当输入一个负数时，先把它变成整数。
            System.out.print("-");
            n = -n;
        }
        if (n > 9) {
            print(n/ 10);//递归
        }
        System.out.print(n % 10 +"   ");
    }
    public static void main(String[] args) {
        System.out.println("请输入一个数:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        print(n);
    }
}