package Dec2020;

import java.util.Arrays;

/**
 * 就是正着走一遍，反着也走一遍
 * 正着求出左边的乘积，反着求出右边的乘积
 * 左边和右边相乘就可以了
 */
public class LeetCode238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int temp = 1;
        Arrays.fill(res,1);
        for(int i = 1;i < n;i++){
            res[i] = res[i-1]*nums[i-1];
        }
        for(int i = n-2;i>=0;i--){
            temp = temp*nums[i+1];
            res[i] = temp*res[i];
        }
        return res;
    }
}
