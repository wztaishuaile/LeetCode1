package Tree;

public class LeetCode101 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return isSymmetric(root.right,root.left);
    }
    private boolean isSymmetric(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null)
            return true;
        if(t1==null||t2==null)
            return false;
        if(t1.val!=t2.val)
            return false;
        return isSymmetric(t1.right,t2.left)&&isSymmetric(t1.left,t2.right);
    }
}
