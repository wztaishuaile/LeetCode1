package Jan2021.digui;

import JianZhiOffer.TreeNode;

public class Leetcode111 {
    //理解错了叶子节点的含义
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.min(minDepth(root.right),minDepth(root.left))+1;
    }

    //分情况讨论
    public int minDepth1(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.right==null && root.left!=null){
            return minDepth1(root.left)+1;
        }
        if(root.left==null && root.right!=null){
            return minDepth1(root.right)+1;
        }
        return Math.min(minDepth1(root.left),minDepth1(root.right))+1;
    }
//这种写法更好看，意思都一样。
    class Solution {
        public int minDepth(TreeNode root) {
            if(root==null)
                return 0;
            int left=minDepth(root.left);
            int right=minDepth(root.right);
            if(root.left==null||root.right==null)
                return left+right+1;
            return Math.min(left,right)+1;
        }
    }

}
