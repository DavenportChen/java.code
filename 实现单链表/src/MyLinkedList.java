/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-01-24
 * Time: 19:51
 */

class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class MyLinkedList {
    public ListNode head;

    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head = node;
        }else{
            node.next = this.head;
            this.head = node;
        }
    }

    public void addLast(int data){
        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head = node;
        }else{
            ListNode cur = this.head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
            node.next = null;
        }
    }

    public boolean contains(int key){
        if(this.head == null){
            return false;
        }
        ListNode cur = this.head;
        while(cur != null){
            if(cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public int size(){
        ListNode cur = this.head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    public ListNode searchPrev(int key){
        ListNode cur = this.head;
        while(cur != null){
            if(cur.next.val == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    public void remove(int key){
        if(this.head == null){
            return;
        }
        if(this.head.val == key){
            this.head = this.head.next;
            return;
        }
        ListNode cur = this.head;
        while(cur!= null){
            if(cur.val == key){
                ListNode prev = searchPrev(key);
                prev.next = cur.next;
                return;
            }
            cur = cur.next;
        }
    }

    public void removeAll(int key){
        if(this.head == null){
            return;
        }
        if(this.head.val == key){
            this.head = this.head.next;
        }
        ListNode cur = this.head;
        while(cur!= null){
            if(cur.val == key){
                ListNode prev = searchPrev(key);
                prev.next = cur.next;
            }
            cur = cur.next;
        }
    }

    public ListNode searchIndex(int index){
        ListNode cur = this.head;
        while(index-2 != 0 ){   //index-1 ?
            cur = cur.next;
            index--;
        }
        return cur;
    }

    public void addIndex(int index,int data){
        if(index < 0 || index > size()){
            System.out.println("无效位置!");
            return;
        }
        ListNode cur = searchIndex(index);
        ListNode node = new ListNode(data);
        node.next = cur.next;
        cur.next = node;

    }


    public void display(){
        ListNode cur = this.head;
        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void clear() {
        this.head = null;
    }

}
