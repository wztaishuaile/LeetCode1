package Tree;

public class LeetCode110 {
    private boolean result=true;
    public boolean isBalanced(TreeNode root) {
        depth(root);
        return result;
    }
    public int depth(TreeNode root){
        if(root==null)
            return 0;
        int l=depth(root.left);
        int r=depth(root.right);
        if(Math.abs(l-r)>1)
            result=false;
        return Math.max(l,r)+1;
    }
}
