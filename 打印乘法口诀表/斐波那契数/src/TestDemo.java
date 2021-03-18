import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-03-13
 * Time: 21:04
 */
public class TestDemo {
    public static int fib(int n){
        if(n == 0 || n == 1)return n;
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++){
            a = a + b;
            b = a - b;
        }
        return  a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

}
