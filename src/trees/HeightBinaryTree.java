package trees;


public class HeightBinaryTree {



    public  static  int maxDepth(TreeNode root) {


        if(root == null) {
            return 0;
        }

        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);


        int maxDepth = Math.max(leftMaxDepth, rightMaxDepth) + 1;

        return maxDepth;

    }


    public static boolean checkFullBinaryTree(TreeNode root) {

        if(root == null) {
            return true;
        }

        if(root.left == null && root.right == null) {
            return  true;
        }

        if(root.left != null && root.right != null) {

            boolean leftFullBinaryTree = checkFullBinaryTree(root.left);
            boolean rightFullBinaryTree = checkFullBinaryTree(root.right);

            return leftFullBinaryTree && rightFullBinaryTree;
        }

        return false;
    }



    public static int countNodes(TreeNode root) {
        if(root == null) {
            return  0;
        }

        int leftTreeCount = countNodes(root.left);
        int rightTreeCount = countNodes(root.right);
        return 1 + leftTreeCount + rightTreeCount;
    }


    public static boolean isComplete(TreeNode root, int index, int numberOfNodes) {

        if(root == null) {
            return  true;
        }

        if(index >= numberOfNodes) {
            return false;
        }

        boolean isLeftCompleteBinaryTree = isComplete(root.left, 2 * index + 1, numberOfNodes);
        boolean isRightCompleteBinaryTree = isComplete(root.right, 2 * index + 2, numberOfNodes);

        return  isLeftCompleteBinaryTree && isRightCompleteBinaryTree;
    }


    public static int deepestLevel(TreeNode root) {

        int deepLevel  = 0;

        while(root != null) {
            deepLevel++;
            root = root.left;
        }
        return  deepLevel;
    }


    public static boolean isPerfectTree(TreeNode root, int currentLevel, int deepestLevel) {

        if(root == null) {
            return true;
        }

        if(root.left == null && root.right == null) {
            if(currentLevel == deepestLevel) {
                return  true;
            }
            return  false;
        }

        if(root.left != null && root.right != null) {

            boolean isLeftPerfectTree = isPerfectTree(root.left, currentLevel + 1, deepestLevel);
            boolean isRightPerfectTree = isPerfectTree(root.right, currentLevel + 1, deepestLevel);

            return isLeftPerfectTree && isRightPerfectTree;
        }

        return false;
    }

    public static void main(String[] args) {


        //Construct binary tree
        TreeNode root = new TreeNode("1");
        root.left = new TreeNode("2");
        root.right = new TreeNode("3");
        root.left.left = new TreeNode("4");
        root.left.right = new TreeNode("5");
        root.right.left = new TreeNode("6");
        root.right.right = new TreeNode("7");
        root.right.right.right = new TreeNode("7");

        int level = deepestLevel(root);
        System.out.print(isPerfectTree(root, 1, level));
    }

}
