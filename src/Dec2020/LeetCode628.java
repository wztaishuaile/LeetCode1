package Dec2020;

public class LeetCode628 {
    public int maximumProduct(int[] nums) {
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int x : nums) {
            if (x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (x >= max2) {
                max3 = max2;
                max2 = x;
            } else if (x > max3) {
                max3 = x;
            }
            if (x <= min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min2 = x;
            }
        }
        return Math.min((min1 * min2 * max1), (max1 * max2 * max3));
    }
}
