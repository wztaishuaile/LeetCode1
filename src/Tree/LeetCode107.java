package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
   BFS与DFS有关树的层次便利
 **/

public class LeetCode107 {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            if (root == null) {
                return ans;
            }
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                List<Integer> tmp = new ArrayList<>();
                int len = q.size();
                for (int i = 0; i < len; i++) {
                    TreeNode node = q.poll();
                    tmp.add(node.val);
                    if (node.left != null) {
                        q.add(node.left);
                    }
                    if (node.right != null) {
                        q.add(node.right);
                    }
                }
                // 在索引 0 的位置加入一维数组 tmp
                // 每次新的数组进来都会被放在开始的位置
                ans.add(0, tmp);
            }
            return ans;
        }
        public List<List<Integer>> levelOrderBottom1(TreeNode root){
            List<List<Integer>> list=new LinkedList<List<Integer>>();
            reverseLevel(list,root,0);
            return list;
        }
        public void reverseLevel(List<List<Integer>> list,TreeNode root,int level){
            if(root==null)
                return;
            if(level>=list.size())
                list.add(0,new LinkedList<Integer>());
            reverseLevel(list,root.left,level+1);
            reverseLevel(list,root.right,level+1);
            list.get(list.size()-level-1).add(root.val);
        }
}
