package func;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-01-25
 * Time: 10:02
 */
class MyQueue {

    private Stack<Integer> s1 = new Stack<>();//入队
    private Stack<Integer> s2 = new Stack<>();//出队

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
       if(empty()){
           return -1;
       }
       if(s2.empty()){
           while(!s1.empty()) {
               s2.push(s1.pop());
           }
       }
       if(s2.empty()){
           return -1;
       }
       return s2.pop();
    }


    /** Get the front element. */
    public int peek() {
        if(empty()){
            return -1;

        }
        if(s2.empty()){
            while(!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        if(s2.empty()){
            return -1;
        }
        return s2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty() && s2.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */