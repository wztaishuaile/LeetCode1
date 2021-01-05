package Dec2020;

import JianZhiOffer.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if(root==null){
            return res;
        }
        List<Integer> values = new ArrayList<>();
        dfs(res,values,root);
        return res;
    }
    private void dfs(List<String> res,List<Integer> values,TreeNode root) {
        if(root==null){
            return;
        }
        values.add(root.val);
        if(ifLeaf(root)){
            res.add(buildPath(values));
        }else{
            dfs(res,values,root.right);
            dfs(res,values,root.left);
        }
        values.remove(values.size()-1);
    }
    private boolean ifLeaf (TreeNode node){
        return node.left ==null&&node.right==null;
    }
    private String buildPath(List<Integer> values) {
        StringBuilder str = new StringBuilder();
        for (int i =0;i<values.size();i++){
            str.append(values.get(i));
            if(i!=values.size()-1){
                str.append("->");
            }
        }
        return str.toString();
    }

}
