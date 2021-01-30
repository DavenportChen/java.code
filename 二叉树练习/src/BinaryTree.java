import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-01-26
 * Time: 15:17
 */
class BTNode{
    public char val;
    public BTNode left;
    public BTNode right;

    public BTNode (char val){
        this.val = val;
    }
}
public class BinaryTree {
    public BTNode creatTree(){
        BTNode A = new BTNode('A');
        BTNode B= new BTNode('B');
        BTNode C = new BTNode('C');
        BTNode D = new BTNode('D');
        BTNode E= new BTNode('E');
        BTNode F = new BTNode('F');
        BTNode G = new BTNode('G');
        BTNode H = new BTNode('H');

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }

    //前序遍历
    void preOrderTraverse(BTNode root){
        if(root == null) return;
        System.out.print(root.val);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }
    //中序遍历
    void inOrderTraverse(BTNode root){
        if(root == null) return;
        inOrderTraverse(root.left);
        System.out.print(root.val);
        inOrderTraverse(root.right);
    }
    //后序遍历
    void postOrderTraverse(BTNode root){
        if(root == null) return;
        postOrderTraverse(root.left);
        postOrderTraverse(root.right);
        System.out.print(root.val);
    }

    //遍历思路 求节点个数
    static int size = 0;
    void getSize1(BTNode root){
        if(root == null) return;
        size++;
        getSize1(root.left);
        getSize1(root.right);

    }

    //子问题思路 求节点个数
    int  getSize2(BTNode root){
        if(root == null) return 0;
        return getSize2(root.left) + getSize2(root.right) + 1;
    }

    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    void getLeafSize1(BTNode root){
        if(root == null) return;
        if(root.left == null && root.right == null){
            leafSize++;
        }
        getSize1(root.left);
        getSize1(root.right);
    }

    // 子问题思路-求叶子结点个数
    int getLeafSize2(BTNode root){
        if(root  == null) return 0;
        if(root.left == null && root.right == null){
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }
    // 子问题思路-求第 k 层结点个数
    int getKLevelSize(BTNode root,int k) {
        if(root == null) return 0;
        if(k == 1) return 1;
        return getKLevelSize(root.left,k-1) +
                getKLevelSize(root.right,k-1);

    }

    //获取二叉树的高度
    int getHeight(BTNode root) {
        if(root == null) return 0;
        return getHeight(root.left) > getHeight(root.right) ?
                getHeight(root.left)+1 : getHeight(root.right)+1;
    }

    //查找VAL所在的节点 没有找到返回NULL
    //前序遍历

    BTNode find(BTNode root, int val){
        if(root == null) return null;
        if(root.val == val){
           return root;
        }
        BTNode ret = find(root.left,val);
        if(ret != null){
            return ret;
        }
        ret = find(root.right,val);
        if(ret != null){
            return ret;
        }
        return null;

    }



    // 层序遍历<有错误？>
    void levelOrderTraversal1(BTNode root) {
        if(root == null) return;
        Queue<BTNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            System.out.print(root.val);
            queue.poll();
            levelOrderTraversal1(root.left);
            levelOrderTraversal1(root.right);
        }
    }
    //层序遍历
    void levelOrderTraversal2(BTNode root) {
        if(root == null) return;
        Queue<BTNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            BTNode cur=queue.poll();
            System.out.print(cur.val+" ");
            if(cur.left != null){
                queue.offer(cur.left);
            }
            if(cur.right != null){
                queue.offer(cur.right);
            }
        }
    }


    //非递归————————————————————
    //前序遍历
    void preOrderTraverseNor(BTNode root){
        if(root == null) return;
        Stack<BTNode> stack = new Stack<>();
        BTNode cur = root;
        while(cur != null || !stack.isEmpty()) { //---》》》难点： 这层while是最后写上去的
            while (cur != null) {
                stack.push(cur);
                System.out.print(cur.val + " ");
                cur = cur.left;
            }
            BTNode top = stack.pop();
            cur = top.right;
        }
    }



    //中序遍历
    void inOrderTraverseNor(BTNode root){
        if(root == null) return;
        Stack<BTNode> stack = new Stack<>();
        BTNode cur = root;
        while(cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            BTNode top = stack.pop();
            System.out.print(top.val+" ");
            cur = top.right;



        }
    }

    //后序遍历
    void postOrderTraversalNor(BTNode root) {
        if (root == null) return;
        Stack<BTNode> stack = new Stack<>();
        BTNode cur = root;

        BTNode prev = null;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;

            }
            BTNode top = stack.peek();
            if (top.right == null || top.right == prev) {
                stack.pop();
                System.out.print(top.val + " ");
                prev = top;

            } else {
                cur = top.right;
            }
        }
    }
/*

    // 判断一棵树是不是完全二叉树
    boolean isCompleteTree(BTNode root) {
        if(root == null)return true;//trur . false 都可
        Queue<BTNode> queue = new LinkedList<>();
        queue.offer(root);

       // BTNode cur = root;
        //queue.offer(cur);
        while(!queue.isEmpty()){
            BTNode cur = queue.poll();
            if(cur != null) {
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else{
                break;
            }
        }
        while(!queue.isEmpty()){
            BTNode cur = queue.peek();
            if(cur != null){
                return false;
            }else{
                queue.poll();
            }
        }
        return true;
    }

*/


}
