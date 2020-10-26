package DP;

public class LeetCode198 {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int pre1=0,pre2=0;
        int cur=0;
        for (int i = 0; i <nums.length ; i++) {
            cur=Math.max(pre2+nums[i],pre1);
            pre2=pre1;
            pre1=cur;
        }
        return cur;
    }
}
