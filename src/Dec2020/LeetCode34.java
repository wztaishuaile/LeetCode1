package Dec2020;

public class LeetCode34 {
        public int[] searchRange1(int[] nums, int target) {
            int leftIdx = binarySearch(nums, target, true);
            int rightIdx = binarySearch(nums, target, false) - 1;
            if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
                return new int[]{leftIdx, rightIdx};
            }
            return new int[]{-1, -1};
        }

        public int binarySearch(int[] nums, int target, boolean lower) {
            int left = 0, right = nums.length - 1, ans = nums.length;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (nums[mid] > target || (lower && nums[mid] >= target)) {
                    right = mid - 1;
                    ans = mid;
                } else {
                    left = mid + 1;
                }
            }
            return ans;
        }
        public int[] searchRange(int[] nums, int target) {
            if(nums==null||nums.length==0)
                return new int[]{-1,-1};
            int l=0,r=nums.length;
            boolean flag = false;
            while(l<=r){
                int m = (l+r)/2;
                if(nums[m] < target){
                    l = m+1;
                }else if(nums[m] > target){
                    r = m-1;
                }
                else{
                    flag = true;
                    r = m-1;
                }
            }
            if(flag){
                r=l;
                int a=l;
                for (int i = a; i >=0 ; i--) {
                    if(nums[i]==target){
                        l = i;
                        continue;
                    }
                        break;
                }
                for (int i = a; i < nums.length; i++) {
                    if(nums[i]==target){
                        r=i;
                        continue;
                    }
                    break;
                }
                return new int[]{l,r};
            }else
                return new int[]{-1,-1};
        }
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] res = new int[] {-1, -1};
            res[0] = binarySearch(nums, target, true);
            res[1] = binarySearch(nums, target, false);
            return res;
        }
        //leftOrRight为true找左边界 false找右边界
        public int binarySearch(int[] nums, int target, boolean leftOrRight) {
            int res = -1;
            int left = 0, right = nums.length - 1, mid;
            while(left <= right) {
                mid = left + (right - left) / 2;
                if(target < nums[mid])
                    right = mid - 1;
                else if(target > nums[mid])
                    left = mid + 1;
                else {
                    res = mid;
                    //处理target == nums[mid]，关键在于左右边界的处理上面
                    if(leftOrRight)
                        right = mid - 1;
                    else
                        left = mid + 1;
                }
            }
            return res;
        }
    }
}
