package Nov2020;

import java.util.ArrayList;
import java.util.List;

public class LeetCode78 {
    public static void main(String[] args) {
        LeetCode78 l = new LeetCode78();
        int[] n={1,2,3};
        System.out.println(l.subsets(n));
    }
    public List<List<Integer>> binaryBit(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < (1 << nums.length); i++) {
            List<Integer> sub = new ArrayList<Integer>();
            for (int j = 0; j < nums.length; j++)
                if (((i >> j) & 1) == 1) sub.add(nums[j]);//位运算注意外层的括号再做相等判断
            res.add(sub);
        }
        return res;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        //走过的所有路径都是子集的一部分，所以都要加入到集合中
        list.add(new ArrayList<>(tempList));//这里要重新new出来一个List，不然List是传地址的
        for (int i = start; i < nums.length; i++) {
            //做出选择
            tempList.add(nums[i]);
            //递归
            backtrack(list, tempList, nums, i + 1);
            //撤销选择
            tempList.remove(tempList.size() - 1);
        }
    }
}
