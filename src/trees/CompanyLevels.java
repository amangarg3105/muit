package trees;


import java.util.ArrayList;

public class CompanyLevels {


    public static void main(String[] args) {

        TreeNode root = new TreeNode("ceo");


        ArrayList<TreeNode> seniorRoles = new ArrayList<>();


        TreeNode node1 = new TreeNode("cto");
        seniorRoles.add(node1);
        TreeNode node2 = new TreeNode("cfo");
        seniorRoles.add(node2);
        TreeNode node3 = new TreeNode("cmo");
        seniorRoles.add(node3);
        TreeNode node4 = new TreeNode("hr head");
        seniorRoles.add(node4);

        root.setChildNodes(seniorRoles);



        TreeNode node5 = new TreeNode("Principal Software Architect");
        TreeNode node6 = new TreeNode("SDE II");
        TreeNode node7 = new TreeNode("SDE I");

        ArrayList<TreeNode> reportingRoles = new ArrayList<>();


        reportingRoles.add(node5);
        reportingRoles.add(node6);
        reportingRoles.add(node7);

        node1.setChildNodes(reportingRoles);


        System.out.println(root.role);
        System.out.println();

        ArrayList<TreeNode> roles = root.getChildNodes();
        System.out.println("Reporting to CEO");
        for(TreeNode node : roles) {
                System.out.print(node.role + "   ");
        }

        System.out.println();
        System.out.println("Reporting to CTO");
        for(TreeNode node : node1.getChildNodes()) {
            System.out.print(node.role + "   ");
        }






    }
}
