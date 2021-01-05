import JianZhiOffer.TreeNode;

import java.util.ArrayList;
import java.util.List;
class Solution{
    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int right = countLevel(root.right);
        int left = countLevel(root.left);
        if(right == left) {
            return countNodes(root.right) + 1<<left;
        }else{
            return countNodes(root.left) + 1<<right;
        }
    }
    private int countLevel(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return countLevel(root.left)+1;
    }
}