package trees;


import java.util.Deque;
import java.util.LinkedList;

public class SpiralOrder {

    /**
     * TC - O(n)
     *
     *
     * @param root
     */
    public static void printZigZag(TreeNode root) {

        Deque<TreeNode> deque = new LinkedList<>();

        boolean isReverse = true;

        deque.add(root);

        while(!deque.isEmpty()) {

            int size = deque.size();

            while (size > 0 ) {
                if (isReverse) {

                    TreeNode node = deque.pollLast();

                    System.out.print(node.role + "  ");

                    if(node.right != null) {
                        deque.addFirst(node.right);
                    }
                    if(node.left != null) {
                        deque.addFirst(node.left);
                    }
                } else {

                    TreeNode node = deque.pollFirst();

                    System.out.print(node.role + "  ");

                    if(node.left != null) {
                        deque.addLast(node.left);
                    }
                    if(node.right != null) {
                        deque.addLast(node.right);
                    }

                }
                size--;
            }
            isReverse = !isReverse;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode("1");
        root.left = new TreeNode("2");
        root.right = new TreeNode("3");
        root.left.left = new TreeNode("4");
        root.left.right = new TreeNode("5");
        root.right.left = new TreeNode("6");


        printZigZag(root);
    }
}
