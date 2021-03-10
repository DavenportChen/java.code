/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-03-05
 * Time: 22:07
 */
public class MyStack {
    private int[] elem;
    private int top;//既可以代表栈顶元素也可代表当前栈大小 --》usedSize;


    public MyStack(){
        this.elem = new int[10];
    }

    public boolean isFull(){
        return this.top == this.elem.length;
    }

    public int push(int value){
        if(isFull()){
            throw new RuntimeException("栈已满！");
        }
        this.elem[this.top] = value;
        this.top++;
        return this.elem[this.top-1];
    }

    public int pop() {
        if(empty()){
            throw new RuntimeException();
        }
        this.top--;
        return this.elem[top];
    }
    public int peek() {
        if(empty()){
            throw new RuntimeException();
        }
        return this.elem[top-1];
    }

    public boolean empty(){
        return this.top == 0;
    }

    public int size(){
        return this.top;
    }
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(2);
        myStack.push(6);
        myStack.push(9);
        myStack.push(1);

        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
        System.out.println(myStack.empty());

    }
}

