package greedyAlgorithm;

public class LeetCode53 {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        int presum=nums[0];
        int ans=presum;
        for(int i=1;i<nums.length;i++){
            presum=presum>0?presum+nums[i]:nums[i];
            ans=Math.max(ans,presum);
        }
        return presum;
    }
}
