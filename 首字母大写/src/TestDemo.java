/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-01-24
 * Time: 23:28
 */
public class TestDemo {
    public static String firstUpper(String str){
        if(str == null || "".equals(str)){
            return str;
        }
        if(str.length() > 1){
            return str.substring(0,1).toUpperCase()+str.substring(1);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(firstUpper("hellow"));
        System.out.println(firstUpper(""));
        System.out.println(firstUpper("a"));
    }
}
