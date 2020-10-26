package Tree;

public class LeetCode564 {
    public TreeNode invertTree(TreeNode root){
        if(root==null)
            return null;
        TreeNode r=root.right;
        root.right=invertTree(root.left);
        root.left=invertTree(r);
        return root;
    }
}
