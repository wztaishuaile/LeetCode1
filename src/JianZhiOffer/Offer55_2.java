package JianZhiOffer;

public class Offer55_2 {
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if(root == null) return true;
            return isBalanced(root.left) && isBalanced(root.right) && (Math.abs(depth(root.left)-depth(root.right)) <= 1);
        }
        private int depth(TreeNode root){
            return root == null ? 0 : (Math.max(depth(root.left),depth(root.right))+1);
        }
    }
}
