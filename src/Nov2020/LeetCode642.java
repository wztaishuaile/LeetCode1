package Nov2020;

import java.util.Arrays;

public class LeetCode642 {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int a = -1;
        int b = 1;
        for(int i = 0;i<nums.length-1;i++) {
            if(nums[i]==nums[i+1]){
                a=nums[i];
            }else if (nums[i+1]-nums[i]>1) {
                b=nums[i]+1;
            }
        }
        return new int[]{a,nums[nums.length-1]!=nums.length?nums.length:b};
    }
}
