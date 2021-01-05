package Jan2021.digui;

import JianZhiOffer.TreeNode;

/**
 * 递归主要做的三件事
 * 1。明确递归结束条件
 * 2。明确本层应该干什么
 * 3。明确本层返回什么东西
 */
public class Leetcode617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        if(t1 == null){
            return t2;
        }
        if(t2 == null ){
            return t1;
        }
        TreeNode root = new TreeNode(t1.val+t2.val);
        root.left = mergeTrees(t1.left,t2.left);
        root.right = mergeTrees(t1.right,t2.right);
        return root;
    }
}
