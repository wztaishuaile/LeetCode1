package JianZhiOffer;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Offer55_1 {
    //递归法求最大深度,递归要快一些
    public int maxDepth1(TreeNode root) {
        if(root==null)
            return 0;
        return Math.max(maxDepth1(root.right),maxDepth1(root.left))+1;
    }
    //层次便利
    public int maxDepth(TreeNode root) {
        int res = 0;
        if(root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode t=q.poll();
                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
            }
            res++;
        }
        return res;
    }
}
