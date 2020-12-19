/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-13
 * Time: 12:48
 */
//package gyy;
public class test13 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Maxint="  +Maxint(a,b));
        double a2 = 1.5;
        double b2 = 3.9;
        System.out.println("Maxdouble="  +Maxdouble(a2,b2));
        double a3 = 4.5;
        double b3 = 7.4;
        int c = 7;
        Cmp(a3,b3,c);
    }

    public static int Maxint(int x, int y) {
        if (y > x) {
            return y;
        } else {
            return x;
        }
    }

    public static double Maxdouble(double x, double y) {
        if (y > x) {
            return y;
        } else {
            return x;
        }
    }

    public static double Cmp(double x, double y, int z) {
        double temp=x>y?x:y;
        double max=temp>z?temp:z;
        double temp1=x<y?x:y;
        double min=temp1<z?temp1:z;
        double mid=(x+y+z*1.0)-max-min;
        System.out.print(max+">"+mid+">"+min);
        return 0;
    }
}
