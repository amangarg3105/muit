package trees;


import java.util.Scanner;

public class TreeNode {


    String role;

    TreeNode left;

    TreeNode right;


    TreeNode(String role) {
        this.role = role;
    }


    public static void takeInput (TreeNode root) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is left child of node available " + root.role);
        boolean isleft = sc.nextBoolean();
        if(isleft) {
            System.out.println("Enter Left Child for " +  root.role);
            int data = sc.nextInt();
            TreeNode node = new TreeNode(Integer.toString(data));
            root.left = node;
            takeInput(root.left);
        }
        System.out.println("Is Right child of node available " + root.role);
        boolean isRight = sc.nextBoolean();
        if(isRight) {
            System.out.println("Enter right Child for " +  root.role);
            int data = sc.nextInt();
            TreeNode node = new TreeNode(Integer.toString(data));
            root.right = node;
            takeInput(root.right);
        }
    }

}
