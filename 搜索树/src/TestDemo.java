/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-02-06
 * Time: 23:55
 */
class BinarySearchTree {

    static class BSNode {
        public int val;
        public BSNode left;
        public BSNode right;

        public BSNode(int val) {
            this.val = val;
        }
    }

    public BSNode root = null;

    //查找
    public BSNode search(int val) {
        if (root == null) return null;

        BSNode cur = root;
        while (cur != null) {
            if (cur.val > val) {
                cur = cur.left;
            } else if (cur.val < val) {
                cur = cur.right;
            } else {
                return cur;
            }
        }
        return null;
    }


    //插入
    public boolean insert(int val) {
        BSNode bsNode = new BSNode(val);
        if (root == null) {
            root = bsNode;
            return true;
        }
        BSNode cur = root;
        BSNode parent = null;
        while (cur != null) {
            if (cur.val > val) {
                parent = cur;
                cur = cur.left;
            } else if (cur.val < val) {
                parent = cur;
                cur = cur.right;
            } else {
                return false;
            }
        }
        if(parent.val < val) {
            parent.right = bsNode;
        }else {
            parent.left = bsNode;
        }
        return true;

    }


    //删除
    public void remove(int val) {
        if (root == null) return;
        BSNode cur = root;
        BSNode parent = null;
        while (cur != null) {
            if (cur.val == val) {
                removeNode(parent, cur, val);
                return;
            } else if (cur.val < val) {
                parent = cur;
                cur = cur.right;
            } else {
                parent = cur;
                cur = cur.left;
            }
        }
    }

    /**
     * 删除二叉搜索树的节点
     *
     * @param parent
     * @param cur
     * @param val
     */
    public void removeNode(BSNode parent,BSNode cur,int val) {
        if(cur.left == null) {
            if(cur == root) {
                root = cur.right;
            }else if(parent.left == cur) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }else if(cur.right == null) {
            if(cur == root) {
                root = cur.left;
            }else if(parent.left == cur) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }else {
            //
            BSNode targetParent = cur;
            BSNode target = cur.right;
            while (target.left != null) {
                targetParent = target;
                target = target.left;
            }
            //target指向的节点就是 右边的最小值
            cur.val = target.val;
            if(target == targetParent.left) {
                targetParent.left = target.right;
            }else {
                targetParent.right = target.right;
            }
        }
    }



    public static class TestDemo {
        public static void preOrder(BinarySearchTree.BSNode root) {
            if(root == null) {
                return;
            }
            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(BinarySearchTree.BSNode root) {
            if(root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.val+" ");
            inOrder(root.right);
        }
        public static void main(String[] args) {
            BinarySearchTree binarySearchTree = new BinarySearchTree();
            binarySearchTree.insert(4);
            binarySearchTree.insert(3);
            binarySearchTree.insert(1);
            binarySearchTree.insert(15);
            //binarySearchTree.insert(12);


            preOrder(binarySearchTree.root);
            System.out.println();
            inOrder(binarySearchTree.root);
            System.out.println();

            try {
                BinarySearchTree.BSNode ret = binarySearchTree.search(14);
                System.out.println(ret.val);
            }catch (NullPointerException e) {
                System.out.println("没有找到当前的节点............");
                e.printStackTrace();
            }
        }
    }
}

