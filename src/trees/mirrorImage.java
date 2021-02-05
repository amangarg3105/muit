package trees;



import java.util.LinkedList;
import java.util.Queue;

public class mirrorImage {


    public static void mirrorImage(TreeNode root) {

        if(root == null)  {
            return;
        }

        mirrorImage(root.left);
        mirrorImage(root.right);

        //Swap logic
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }



    public static void lineByLineTraversal(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();

            while (size > 0) {
                TreeNode node = queue.poll();

                System.out.print(node.role + "  ");

                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
                size--;
            }
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


        lineByLineTraversal(root);
        mirrorImage(root);
        System.out.println("Mirror Tree");
        lineByLineTraversal(root);

    }
}
