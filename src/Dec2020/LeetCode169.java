package Dec2020;

import java.util.Arrays;

public class LeetCode169 {
    public int majorityElement1(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        /**
         * 这里并非返回n/2-1 一个元素时就不行
         */
        return nums[n/2];
    }

    public int majorityElement(int[] nums){
        int res = nums[0],count = 0;
        for(int x:nums){
            res = count == 0?x:res;
            count = res == x? ++count:--count;
        }
        return res;
    }
}
