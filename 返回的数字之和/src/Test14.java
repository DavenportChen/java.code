/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-14
 * Time: 20:59
 */
import java.util.Scanner;
public class Test14 {
    public static int returnAdd(int n){
            if(n < 10){
            return n;
        }
        return n%10 + returnAdd(n/10);
    }

    public static void main(String[] args) {
        System.out.println("请输入一个数:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(returnAdd(n));
    }
}
