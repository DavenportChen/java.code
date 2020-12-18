/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-05
 * Time: 17:01
 */
public class test4 {
    public static void main(String[] args) {
        int i = 0 ;
        for (i = 0; i <= 999; i++) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            if ((a * a * a) + (b * b * b) + (c * c * c) == i) {
                System.out.println(i);
            }
        }
    }
}

