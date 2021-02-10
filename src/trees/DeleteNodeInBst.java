package trees;


public class DeleteNodeInBst {


    /**
     * T.C - O(log n)
     * @param root
     * @param deleteKey
     * @return
     */
    public static TreeNode deleteNode(TreeNode root, int deleteKey) { //30 //30


        if(root == null) {
            return null;
        }

        if(deleteKey < Integer.parseInt(root.role)) {
            root.left = deleteNode(root.left, deleteKey);
        } else if  (deleteKey > Integer.parseInt(root.role)){
            root.right = deleteNode(root.right, deleteKey); //root.right = 30.left
        } else {
            //start deleting
            if(root.left != null && root.right != null) { //Two children
                //get max node
                //replace root value with max value
                //delete max node
                int leftMax = max(root.left);
                root.role = Integer.toString(leftMax);
                root.left = deleteNode(root.left, leftMax);

                return root;
            } else if (root.right != null) { //one child
                return root.right;
            } else if (root.left != null) { //one child
                return root.left; //35
            } else {
                return null; //zero child
            }
        }
        return  root;
    }

    private static int max(TreeNode node) {
        while(node.right != null) {
            node = node.right;
        }
        return Integer.parseInt(node.role);
    }




    public static void main(String[] args) {
        TreeNode root = new TreeNode("7");

        InsertionInBst.insertNode(root, 6);
        InsertionInBst.insertNode(root, 10);
        InsertionInBst.insertNode(root, 5);
        InsertionInBst.insertNode(root, 8);
        InsertionInBst.insertNode(root, 12);


        MirrorImage.lineByLineTraversal(root);

        System.out.println();
        deleteNode(root, 10);

        MirrorImage.lineByLineTraversal(root);

    }
}
