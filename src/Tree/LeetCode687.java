package Tree;

public class LeetCode687 {
        private int ans;
        public int longestUnivaluePath(TreeNode root) {
            ans = 0;
            longestPath(root);
            return ans;
        }
        public int longestPath(TreeNode root) {
            if(root==null)
                return 0;
            int left=longestPath(root.left);
            int right=longestPath(root.right);
            left=root.left!=null&&root.val==root.left.val?left+1:0;
            right=root.right!=null&&root.val==root.right.val?right+1:0;
            ans=Math.max(ans,left+right);
            return Math.max(left,right);
        }
}
