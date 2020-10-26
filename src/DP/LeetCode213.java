package DP;

public class LeetCode213 {
    public static int rob(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        return Math.max(robserver(0,nums.length-1,nums),robserver(1,nums.length,nums));
    }
    public static int robserver(int l,int r,int[] nums){
        int pre1=0,pre2=0,cur=0;
        for(int i=l;i<r;i++){
            cur=Math.max(pre2+nums[i],pre1);
            pre2=pre1;
            pre1=cur;
        }
        return cur;
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,1};

        System.out.println(rob(a));
    }
}
