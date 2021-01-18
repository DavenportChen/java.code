/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-01-09
 * Time: 17:48
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(5);
        myLinkedList.addLast(4);
        myLinkedList.addLast(3);
        myLinkedList.addLast(2);

        myLinkedList.display();
        System.out.println(myLinkedList.detectCycle());
    }
}