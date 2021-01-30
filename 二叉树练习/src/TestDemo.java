import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Descriptiion:
 * User: ${陈文博}
 * Date: 2021-01-26
 * Time: 15:16
 */
public class TestDemo {
    public static void main(String[] args) {
        HeapDemo heapDemo = new HeapDemo();
        int[] array = {27, 15, 19, 18, 28, 34, 65, 49, 25, 37};
        System.out.println(Arrays.toString(array));
        heapDemo.creatBigHeap(array);
        heapDemo.show();
        System.out.println();
        System.out.println(heapDemo.poll());
        heapDemo.show();



        /*
        heapDemo.show();
        System.out.println();
        heapDemo.peek();
        heapDemo.show();
        System.out.println();

        heapDemo.push(100);
        heapDemo.show();


        public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BTNode root = binaryTree.creatTree();

        binaryTree.preOrderTraverseNor(root);
        System.out.println();

        binaryTree.inOrderTraverseNor(root);
        System.out.println();
        binaryTree.postOrderTraversalNor(root);
        System.out.println();

        BTNode result = binaryTree.find(root,'C');
        System.out.println(result.val);
        System.out.println();
        binaryTree.levelOrderTraversal1(root);
        System.out.println();
        binaryTree.levelOrderTraversal2(root);
        System.out.println();
        binaryTree.preOrderTraverse(root);
        System.out.println();
        binaryTree.inOrderTraverse(root);
        System.out.println();
        binaryTree.postOrderTraverse(root);
        System.out.println();
        System.out.println(binaryTree.getLeafSize2(root));
        System.out.println(binaryTree.getHeight(root));
        System.out.println(binaryTree.getKLevelSize(root,3));
    */
    }

}