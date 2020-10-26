package JianZhiOffer;

import java.util.Arrays;

public class Offer03 {
    public static void main(String[] args) {

    }

    /*
    映射法，找数组中的重复元素，类似自建一个哈希表
     */
    public int findRepeatNumber(int[] nums) {
        int length=nums.length;
        int[] a = new int[length];
        for (int x : nums) {
            a[x]++;
            if (a[x] > 1)
                return x;
        }
        return -1;
    }

    /*
    先排序，排序之后对相邻两个元素进行比较，来找重复元素
     */
    public int findRepeatNumber1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length; i++) {
            if (nums[i] == nums[i + 1])
                return nums[i];
        }
        return -1;
    }
    /*
    普通方法，直接存入HashSet中，找出重复的
     */
}
