import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-03-06
 * Time: 0:03
 */
public class TestDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();//LinkedList<>()底层为一个双向链表
        queue.offer(5);//尾插  当队列满的情况下 offer（返回true 或 false） 优于 add(抛出异常)
        queue.add(3);//默认从尾巴入队；
        queue.offer(2);
        queue.offer(8);
        queue.offer(6);
        System.out.println(queue.poll());
        System.out.println(queue);

    }
}
