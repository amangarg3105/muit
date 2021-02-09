package trees;


public class InsertionInBst {



    public static TreeNode insertNode(TreeNode root, int insertValue) { //null //7

        if (root == null) {
            TreeNode node = new TreeNode(Integer.toString(insertValue));
            return node;
        }

        //Taking decision whether to go left or right
        if (insertValue < Integer.parseInt(root.role)) {
            root.left = insertNode(root.left, insertValue); // 5.left = 1
        } else if (insertValue > Integer.parseInt(root.role)) {
            root.right = insertNode(root.right, insertValue); //5.right = 7
        }
        return root;
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode("5");

        MirrorImage.lineByLineTraversal(root);
        System.out.println();


        insertNode(root, 1);
        MirrorImage.lineByLineTraversal(root);
        insertNode(root, -2);

        System.out.println();
        MirrorImage.lineByLineTraversal(root);


        insertNode(root, 7);
        System.out.println();
        MirrorImage.lineByLineTraversal(root);

    }
}
