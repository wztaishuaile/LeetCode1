package Nov2020;

public class LeetCode485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,cur=0;
        for(int x:nums){
            cur=x==0?0:cur+1;
            max=Math.max(cur,max);
        }
        return max;
    }
}
