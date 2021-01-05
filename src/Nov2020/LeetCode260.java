package Nov2020;

public class LeetCode260 {
    public int[] singleNumber(int[] nums) {
        int flag = 0;
        for (int n : nums) {
            flag ^= n;
        }
        flag &= -flag;
        int[] res = new int[2];
        for (int n : nums) {
            if ((n & flag) == 0)
                res[0] ^= n;
            else
                res[1] ^= n;
        }
        return res;
    }
}
