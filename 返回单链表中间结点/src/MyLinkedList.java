/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-01-05
 * Time: 15:48
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
    public Node returnMidNode() {
        if(this.head == null){
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        fast = fast.next.next;
        slow = slow.next;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.createLinked();
        myLinkedList.display();
        Node ret = myLinkedList.returnMidNode();
        System.out.println(ret.val);

    }
}
