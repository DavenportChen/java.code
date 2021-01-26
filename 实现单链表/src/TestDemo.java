/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-01-24
 * Time: 19:52
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(2);
        myLinkedList.display();
        myLinkedList.remove(2);
        myLinkedList.display();
        myLinkedList.removeAll(2);
        myLinkedList.display();
        myLinkedList.addIndex(3,5);
        myLinkedList.display();

        myLinkedList.clear();
        myLinkedList.display();

    }
}
