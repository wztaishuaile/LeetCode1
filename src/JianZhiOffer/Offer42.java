package JianZhiOffer;

public class Offer42 {
    //dp解法
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        int max=dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            max=Math.max(max,dp[i]);
        }
        return max;
    }
    //非dp解法
    public int maxSubArray1(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int sum=0;
        int res=nums[0];//初值要设好，不能设成零，得设成数组的第一个值
        for(int x:nums){
            sum=(sum<0)?sum+x:x;
            res=Math.max(sum,res);
        }
        return res;
    }
}
