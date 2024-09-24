package garcia.ruben.utils.data_structures;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode populateTreeNode_Inorder(int[] arr){
        int length = arr.length;
        if(length == 0) return null;
        if(length == 1) return new TreeNode(arr[0], null, null);
        TreeNode rootNode = new TreeNode();
        return rootNode;
    }
}
