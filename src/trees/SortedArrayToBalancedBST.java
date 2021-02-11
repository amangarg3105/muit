package trees;




public class SortedArrayToBalancedBST {


    public  static TreeNode constructTree(int [] arr, int start, int end) {


        if(start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(Integer.toString(arr[mid]));

        root.left = constructTree(arr, start, mid - 1);

        root.right = constructTree(arr, mid + 1, end);

        return root;


    }

    public static void main(String[] args) {


        int arr [] = {5, 6 ,7, 11, 13, 15};

        TreeNode root = constructTree(arr, 0, arr.length - 1);

        MirrorImage.lineByLineTraversal(root);

        System.out.println(root.left.right.role);

    }
}
