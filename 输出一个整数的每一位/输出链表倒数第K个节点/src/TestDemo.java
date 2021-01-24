/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-01-08
 * Time: 16:37
 */
public class TestDemo {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(11);
        myLinkedList.addLast(14);
        myLinkedList.addLast(25);
        myLinkedList.addLast(34);
        myLinkedList.addLast(55);
        myLinkedList.display();

        Node ret = myLinkedList.findLastNodeK(3);
        System.out.println(ret.val);
    }
}
