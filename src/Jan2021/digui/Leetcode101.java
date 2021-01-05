package Jan2021.digui;

import JianZhiOffer.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode101 {
    //递归解法
    public boolean isSymmetric1(TreeNode root) {
        if(root == null)
            return true;
        return help(root.left,root.right);
    }
    private boolean help(TreeNode l,TreeNode r){
        if(l == null && r == null) {
            return true;
        }
        if(l == null || r == null || l.val!=r.val){
            return false;
        }
        return help(l.left,r.right)&&help(r.left,l.right);
    }

    //迭代,层次遍历比较用到队列，但是效率不如递归
    public boolean isSymmetric(TreeNode root){
        if(root == null){
            return true;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root.left);
        q.offer(root.right);
        while(!q.isEmpty()){
            TreeNode node1 = q.poll();
            TreeNode node2 = q.poll();
            if(node1==null&&node2==null){
                continue;
            }
            if(node1==null || node2==null || node1.val!=node2.val){
                return false;
            }
            q.offer(node1.left);
            q.offer(node2.right);
            q.offer(node1.right);
            q.offer(node2.left);
        }
        return true;
    }
}
