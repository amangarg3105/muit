package trees;


import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {



    public static void levelOrderTraversal(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.role + "   ");
            if(node.left != null) {
                queue.add(node.left);
            }
            if(node.right != null) {
                queue.add(node.right);
            }
        }
    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode("1");
        root.left = new TreeNode("2");
        root.right = new TreeNode("3");
        root.left.left = new TreeNode("4");
        root.left.right = new TreeNode("5");
        root.right.left = new TreeNode("6");

        levelOrderTraversal(root);
    }
}
