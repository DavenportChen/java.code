/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-08
 * Time: 16:47
 */
import java.util.Scanner;
public class test6 {
    public static void main(String[] args) {
        System.out.println("请输入一个数:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0;i < 32;i++) {
            if(((n >> i) & 1) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}


