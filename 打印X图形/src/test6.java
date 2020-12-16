/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2020-12-08
 * Time: 17:31
 */
import java.util.Scanner;
public class test6{
    public static void main(String[] args){
        System.out.println("请输入行数:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if((i==j) || (i+j==n+1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");}
            }
            System.out.println();
        }
    }
}


