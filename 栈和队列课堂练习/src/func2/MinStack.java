package func2;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-01-25
 * Time: 10:51
 */
class MinStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> mins = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }


    public void push(int x) {
        s1.push(x);
        if(mins.empty()){
            mins.push(x);
        }else {
            if (s1.push(x) <= mins.peek()) {
                mins.push(x);
            }
        }
    }

    public void pop() {
        int x = s1.pop();
        if(x == mins.peek()){
            mins.pop();
        }
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return mins.peek();

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
