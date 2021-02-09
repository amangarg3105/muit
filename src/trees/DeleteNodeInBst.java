package trees;


public class DeleteNodeInBst {


    /**
     * T.C - O(log n)
     * @param root
     * @param deleteKey
     * @return
     */
    public static TreeNode deleteNode(TreeNode root, int deleteKey) {


        if(root == null) {
            return null;
        }

        if(deleteKey < Integer.parseInt(root.role)) {
            root.left = deleteNode(root.left, deleteKey);
        } else if  (deleteKey > Integer.parseInt(root.role)){
            root.right = deleteNode(root.right, deleteKey);
        } else {
            //start deleting
            if(root.left != null && root.right != null) { //Two children
                //get max node
                //replace root value with max value
                //delete max node
            } else if (root.right != null) { //one child
                return root.right;
            } else if (root.left != null) { //one child
                return root.left;
            } else {
                return null; //zero child
            }
        }
        return  root;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode("7");

        InsertionInBst.insertNode(root, 6);
        InsertionInBst.insertNode(root, 10);
        InsertionInBst.insertNode(root, 5);

        MirrorImage.lineByLineTraversal(root);

        System.out.println();
        deleteNode(root, 6);
        deleteNode(root, 10);

        MirrorImage.lineByLineTraversal(root);
    }
}
