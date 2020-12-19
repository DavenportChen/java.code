/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-14
 * Time: 20:26
 */
import java.util.Scanner;
    public class Test14 {
        public static int Fib(int n) {
            if(n == 1){
                return 1;
            }
            else{
                return n*Fib(n-1);
            }
        }

    public static void main(String[] args) {
        System.out.println("请输入一个数:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fib(n));
    }
}

