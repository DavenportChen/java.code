/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-22
 * Time: 19:59
 */

import java.util.Scanner;
public class Test22 {
    /**
     *
     *
     *
     * 应该由高到低按位与
     *
     *
     *
     * @param args
     */
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.print("奇数位二进制序列:");
            for(int i=30;i>=0;i-=2){
                System.out.print((n>>i)&1);
            }
            System.out.print("  偶数位二进制序列:");
            for(int i=31;i>0;i-=2){
                System.out.print((n>>i)&1);
            }
            sc.close();
        }
    }

//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.print("奇数位二进制序列:  ");
//        for(int i = 0; i < 31; i += 2) {
//            System.out.print((n>>i)&1);
//        }
//        System.out.print("偶数位二进制序列:");
//        for(int j = 1; j < 32; j += 2) {
//            System.out.print((n>>j)&1);
//        }
//        sc.close();
//    }
//}
