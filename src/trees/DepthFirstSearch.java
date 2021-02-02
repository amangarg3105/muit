package trees;


import java.util.Stack;

public class DepthFirstSearch {


        public static void preOrder(TreeNode root) {  //Preorder traversal

        if(root == null) {
            return;
        }

        System.out.print(root.role + "   ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void preOrderUsingIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.role + "   ");
            if(node.right != null) {
                stack.push(node.right);
            }
            if(node.left != null) {
                stack.push(node.left);
            }
        }
    }


    public static void postOrder(TreeNode root) {

        if(root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.role + "   ");
    }


    public static void inOrder(TreeNode root) {

        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.role + "   ");
        inOrder(root.right);

    }



    public static void inOrderUsingIterative(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            System.out.print(node.role + "    ");
            root = node.right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode("1");
        root.left = new TreeNode("2");
        root.right = new TreeNode("3");
        root.left.left = new TreeNode("4");
        root.left.right = new TreeNode("5");
        root.right.left = new TreeNode("6");
        root.right.right = new TreeNode("7");


//        inOrderUsingIterative(root);
//        System.out.println();
//        inOrder(root);
        preOrder(root);

        System.out.println();

        preOrderUsingIterative(root);

      //  postOrder(root);


    }
}
