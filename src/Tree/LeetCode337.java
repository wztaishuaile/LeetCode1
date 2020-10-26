package Tree;

public class LeetCode337 {
    public int rob(TreeNode root){
        if(root==null)
            return 0;
        int res1=root.val;
        if(root.right!=null)
            res1+=rob(root.right.left)+rob(root.right.right);
        if(root.left!=null)
            res1+=rob(root.left.right)+rob(root.left.left);
        int res2=rob(root.left)+rob(root.right);
        return Math.max(res1,res2);
    }
}
