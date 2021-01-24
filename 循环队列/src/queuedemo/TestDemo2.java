package queuedemo;

/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-01-24
 * Time: 11:54
 */
public class TestDemo2 {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(4);
        myCircularQueue.enQueue(1);
        myCircularQueue.enQueue(2);
        myCircularQueue.enQueue(3);
        myCircularQueue.enQueue(4);
        myCircularQueue.enQueue(5);
        myCircularQueue.enQueue(5);


        System.out.println(myCircularQueue.Front());
        System.out.println(myCircularQueue.Rear());
        System.out.println(myCircularQueue.isFull());
        System.out.println(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.Front());
        System.out.println(myCircularQueue.isEmpty());
    }
}
