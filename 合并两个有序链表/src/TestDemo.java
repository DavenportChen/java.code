/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-01-08
 * Time: 16:05
 */
public class TestDemo {


    public  static Node combineTwoList(Node headA, Node headB) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (headA != null && headB != null) {
            if (headA.val > headB.val) {
                tmp.next = headB;
                headB = headB.next;
            } else {
                tmp.next = headA;
                headA = headA.next;
            }
            tmp = tmp.next;
        }
        if (headA != null) {
            tmp.next = headA;
        }
        if (headB != null) {
            tmp.next = headB;

        }
        return newHead.next;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList =  new MyLinkedList();
        myLinkedList.addLast(11);
        myLinkedList.addLast(14);
        myLinkedList.addLast(25);
        myLinkedList.addLast(34);
        myLinkedList.addLast(55);
        myLinkedList.display();

        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addLast(13);
        myLinkedList2.addLast(18);
        myLinkedList2.addLast(26);
        myLinkedList2.addLast(33);
        myLinkedList2.addLast(46);
        myLinkedList2.display();

        Node ret = combineTwoList(myLinkedList.head,myLinkedList2.head);
        myLinkedList.display(ret);

    }
}
