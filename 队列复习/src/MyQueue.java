/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-03-06
 * Time: 0:43
 */
class Node{
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }


}

public class MyQueue {
    public Node first;//头
    public Node last;//尾
    public int size;


    public boolean offer(int val){
        Node node = new Node(val);
        if(this.first == null){
            this.first = node;
            this.last = node;
        }else{
            this.last.next = node;
            this.last = node;
        }
        size++;
        return true;
    }


    public int poll() throws RuntimeException{
        if(isEmpty()){
            throw new RuntimeException("队列为空！");
        }
        int ret = this.first.val;
        this.first = this.first.next;
        size--;
        return ret;
    }

    public int peek()  throws RuntimeException{
        if(isEmpty()){
            throw new RuntimeException("队列为空！");
        }
        return this.first.val;
    }

    public boolean isEmpty(){
        if(this.first == null && this.last == null){
            return true;
        }
        return false;
    }

    public void show(){
        for(int i = 0; i < size; i++){
            System.out.println(this.first.val);
            this.first = this.first.next;
        }
    }
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(5);
        myQueue.offer(9);
        myQueue.offer(3);
//        System.out.println(myQueue.peek());
//        myQueue.poll();
//        System.out.println(myQueue.size);
        myQueue.show();
    }
}
