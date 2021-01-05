package Nov2020;

import java.util.ArrayList;
import java.util.List;

public class LeetCode228 {
    public static void main(String[] args) {
        LeetCode228 l = new LeetCode228();
        int[] n = {0, 1, 4, 5, 6, 8, 9, 23};
        System.out.println(l.summaryRanges(n));

    }

    public List<String> summaryRanges(int[] nums) {
        if (nums == null && nums.length == 0)
            return new ArrayList<>();
        List<String> res = new ArrayList<>();
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (j < nums.length - 1 && nums[j] + 1 == nums[j + 1])
                continue;
            if (i == j) {
                res.add(nums[i] + "");
            } else {
                res.add(nums[i] + "->" + nums[j]);
            }
            i = j + 1;
        }
        return res;
    }

}
