package Tree;

public class LeetCode572 {
    public boolean isSubtree(TreeNode s,TreeNode t){
        if(s==null)
            return false;
        return isSubTreeWithRoot(s,t)||isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    public boolean isSubTreeWithRoot(TreeNode s,TreeNode t){
        if(s==null&&t==null)
            return true;
        if(s==null||t==null)
            return false;
        if(s.val!=t.val)
            return false;
        return isSubTreeWithRoot(s.left,t.left)&&isSubTreeWithRoot(s.right,t.right);
    }
}
