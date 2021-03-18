import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-03-13
 * Time: 23:47
 */
public class MyArrayList {
    private int[] elem;
    private int  usedSize;

    //不带参数的构造方法
    public MyArrayList() {
        this.elem = new int[5];
    }
    //带参数的构造方法
    public MyArrayList(int capacity){
        this.elem = new int[capacity];
    }

    //打印顺序表
    public void display(){
        for(int i = 0; i < this.usedSize; i++){
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }


    //获取顺序表长度
    public int size(){
        return this.usedSize;
    }

    //判断顺序表是否已满
    public boolean isFull(){
        return this.elem.length == this.usedSize;
    }

    //扩容
    public void resize(){
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);//二倍扩容
        }
    }

    //在pos位置插入元素data
    public void add(int pos,int data){
        if(isFull()){
            System.out.println("顺序表已满！！！");
            resize();
        }
        if(pos < 0 || pos > usedSize){
            System.out.println("插入位置不合法！！！");
            resize();
        }
        for(int i = usedSize-1; i >= pos; i--){
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }


    //默认插到顺序表最后
    public void add2(int data){
        if(isFull()){
            System.out.println("顺序表已满！！！");
            resize();
        }
        this.elem[usedSize] = data;
        this.usedSize++;
    }


    //判断是否包含某个元素
    public boolean contains(int key){
        for(int i = 0; i < this.usedSize; i++){
            if(this.elem[i] == key){
                return true;
            }
        }
        return false;
    }


    //获取元素Key对应的位置
   public int search(int key){
        for(int i = 0; i < this.usedSize; i++){
            if(this.elem[i] == key){
                return i;
            }
        }
        return -1;
    }

    //获取pos位置的元素
    public int getPos(int pos) {
        if(pos < 0 || pos >= this.usedSize) {
            System.out.println("获取位置不合法！！！");
            return -1;
        }
        return this.elem[pos];

    }

    //将pos位置修改为value
    public void setPos(int pos,int value) {
        if(pos < 0 || pos >= this.usedSize) {
            return;
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int key) {
        int index = search(key);
        if(index == -1) {
            System.out.println("没有该数字!");
            return;
        }
        for(int i = index; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }

    //清空顺序表
    public void clear(){
        this.usedSize = 0;
    }


    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);

        myArrayList.display();
        System.out.println(myArrayList.contains(4));
        myArrayList.remove(2);
        myArrayList.display();
        int ret = myArrayList.getPos(2);
        System.out.println(ret);
        myArrayList.setPos(2,9);
        myArrayList.display();
        myArrayList.add2(7);
        myArrayList.display();
        myArrayList.clear();
        myArrayList.display();
    }

}
