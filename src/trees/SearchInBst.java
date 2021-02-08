package trees;


import java.util.Scanner;

public class SearchInBst {


    public static boolean isAvailable(TreeNode root, int data) {

        if(root == null) {
            return false;
        }

        if(Integer.parseInt(root.role) == data) {
            return  true;
        }

        if (data < Integer.parseInt(root.role)) {
            //go to left
           boolean ans = isAvailable(root.left, data);
           return ans;
        }

       else {
            boolean ans = isAvailable(root.right, data);
            return ans;
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode("5");
        TreeNode.takeInput(root);


        System.out.println(isAvailable(root, 7));
    }
}
