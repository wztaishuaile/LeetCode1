package Tree;

public class LeetCode437 {
    public int pathSum(TreeNode root, int sum) {
        if(root==null)
            return 0;
        //注意方法的调用和递归，想好了用哪一个方法
        return pathCount(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }
    public int pathCount(TreeNode root,int sum){
        int res=0;
        if(root==null)
            return 0;
        if(root.val==sum)
            res++;
        res+=pathCount(root.right,sum-root.val)+pathCount(root.left,sum-root.val);
        return res;
    }
}
