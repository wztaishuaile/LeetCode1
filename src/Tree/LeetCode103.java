package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root==null)
            return null;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int depth = 0;
        while(!q.isEmpty()){
            int n = q.size();
            for(int i =0;i<n;i++){
                LinkedList<Integer> temp = new LinkedList<>();
                TreeNode node = q.poll();
                if(depth%2==0){
                    temp.add(node.val);
                }else{
                    temp.add(0,node.val);
                }
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
                res.add(temp);
            }
            depth++;
        }
        return res;
    }
}
