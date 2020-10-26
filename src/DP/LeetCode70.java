package DP;

public class LeetCode70 {
    public int climbStairs(int n) {
        if(n<=2)
            return n;
        int pre2=1,pre1=2;
        int res=0;
        for(int i=2;i<n;i++){
            res=pre1+pre2;
            pre2=pre1;
            pre1=res;
        }
        return res;
    }
}
