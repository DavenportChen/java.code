/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-03-07
 * Time: 13:01
 */

public class MyCircularQueue {
    private int front;
    private int rear;//当前可以存放数组的下标
    private final int[] elem;


    public MyCircularQueue(int k){
        this.elem = new int[k];
        this.front = 0;
        this.rear = 0;

    }

    public boolean enQueue(int value){
        if(isFull()){
            return false;
        }
        this.elem[this.rear] = value;
        this.rear = (this.rear+1)%this.elem.length;
        return true;
    }
    public boolean  deQueue(){
        if(isEmpty()){
            return false;
        }
        this.front = (this.front+1)%this.elem.length;
        return true;
    }

    //得到队头元素
    public int Front(){
        if(isEmpty()){
            return -1;
        }
        return this.elem[this.front];
    }

    public int rear(){
        if(isEmpty()){
            return -1;
        }
        int index = -1;
        if(this.rear == 0){
            index = this.elem.length-1;
        }else{
            index = this.rear-1;
        }
        return this.elem[index];
    }

    public boolean isFull(){
        return (this.rear+1)%(this.elem.length) == this.front;
    }

    public boolean isEmpty(){
        return this.front == this.rear;
    }
}
