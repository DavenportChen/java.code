/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-01-05
 * Time: 15:02
 */
class Node {
    public int val;
    public Node next;
    public Node() {

    }
    public Node(int val) {
        this.val = val;
    }
}
public class MyLinkedList {
    public Node head;
    public void createLinked() {
        this.head = new Node(12);
        Node node2 = new Node(22);
        Node node3 = new Node(22);
        Node node4 = new Node(32);
        Node node5 = new Node(32);
        Node node6 = new Node(42);

        this.head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;


    }
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public Node deleteDuplication() {
        if(head == null){
            return null;
        }
        Node newHead = new Node(-1);
        Node tmp = newHead;
        Node cur = head;
        while(cur != null) {
            if(cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else{
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.createLinked();
        myLinkedList.display();
        myLinkedList.deleteDuplication();
        myLinkedList.display();


    }
}