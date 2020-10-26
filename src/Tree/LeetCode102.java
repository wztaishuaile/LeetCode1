package Tree;
/*
树的高度
 */
public class LeetCode102 {
    public int maxDepth(TreeNode root){
        if(root==null)
            return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
