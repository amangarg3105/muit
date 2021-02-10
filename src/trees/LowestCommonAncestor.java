package trees;


public class LowestCommonAncestor {


    public static TreeNode lcaInBst(TreeNode root, int node1, int node2) {

        if(root == null) {
            return  null;
        }

        int rootData = Integer.parseInt(root.role);

        if(node1 > rootData && node2 > rootData) {
            TreeNode rightLca  =  lcaInBst(root.right, node1, node2);
            return rightLca;
        } else if (node1 < rootData && node2 < rootData) {
            TreeNode leftLca = lcaInBst(root.left, node1, node2);
            return leftLca;
        }
        return root;
    }


    public static TreeNode lca (TreeNode root, int node1, int node2) {

        if(root == null) {
            return  null;
        }

        if(Integer.parseInt(root.role) == node1 || Integer.parseInt(root.role) == node2) {
            return root;
        }

        TreeNode leftLca = lca(root.left, node1, node2); // null
        TreeNode rightlca = lca(root.right, node1, node2); // 10

        if(leftLca != null && rightlca != null) {
            return  root;
        }

        if(leftLca != null) {
            return leftLca;
        }
        return rightlca;
    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode("7");

        InsertionInBst.insertNode(root, 6);
        InsertionInBst.insertNode(root, 10);
        InsertionInBst.insertNode(root, 5);
        InsertionInBst.insertNode(root, 8);
        InsertionInBst.insertNode(root, 12);

        System.out.println(lcaInBst(root, 6, 12).role);

        MirrorImage.lineByLineTraversal(root);


    }
}
