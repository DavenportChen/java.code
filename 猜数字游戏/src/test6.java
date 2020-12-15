/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-08
 * Time: 16:57
 */
import java.util.Random;
import java.util.Scanner;
public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int rand = random.nextInt(100);
        while (true) {
            System.out.println("请输入一个数字：");
            int n = sc.nextInt();
            if (n > rand) {
                System.out.println("猜的大了");
            } else if (n == rand) {
                System.out.println("猜对了");
                break;
            } else {
                System.out.println("猜小了");
            }
        }
        System.out.println("游戏结束！");
    }
}