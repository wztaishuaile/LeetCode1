package littleGirl;

public class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int i = 0;
        int j = nums.length;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] <= target) {
                i = mid + 1;
            } else if (nums[mid] >= target) {
                j = mid - 1;
            } else {
                return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}
