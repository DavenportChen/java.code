/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-01-24
 * Time: 15:23
 */

class Node{
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class MyQueue {
    public Node first;
    public Node last;

    public boolean offer(int val){
        Node node = new Node(val);
        if(this.first == null){
            this.first = node;
            this.last = node;
        }else{
            this.last.next = node;
            this.last = node;
        }
        return true;
    }

    public int poll() throws RuntimeException {
        if(isEmpty()){
            throw new RuntimeException("队列为空!");
        }
        int ret = this.first.val;
        this.first = this.first.next;
        return ret;
    }

    public int peek() throws RuntimeException {
        if(isEmpty()){
            throw new RuntimeException();
        }
        return this.first.val;
    }


    private boolean isEmpty() {
        if(this.first == null && this.last == null){
            return true;
        }
        return false;
    }

}
