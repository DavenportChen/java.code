
/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-05
 * Time: 17:18
 */

import java.util.Scanner;
public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        while (a % b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}
