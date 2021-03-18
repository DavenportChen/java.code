/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-03-18
 * Time: 18:50
 */
public class TestDemo {

    public static int jump(int target){
        if(target == 1 || target == 2)return target;
        return 2*jump(target-1);
    }
    public static void main(String[] args) {
        System.out.println(jump(5));
    }

}
