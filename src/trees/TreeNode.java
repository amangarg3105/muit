package trees;


import java.util.ArrayList;

public class TreeNode {


    String role;

    ArrayList<TreeNode> childNodes;


    TreeNode(String role) {
        this.role = role;
    }


    public void setChildNodes(ArrayList<TreeNode> childNodes) {
        this.childNodes = childNodes;
    }


    public ArrayList<TreeNode> getChildNodes() {
        return childNodes;
    }
}
