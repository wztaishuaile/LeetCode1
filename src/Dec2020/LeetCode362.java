package Dec2020;

/**
 * 3的幂次的质因子只有3，而所给出的n如果也是3的幂次，
 * 故而题目中所给整数范围内最大的3的幂次的因子只能是3的幂次，
 * 1162261467是3的19次幂，是整数范围内最大的3的幂次
 */
public class LeetCode362 {
    public boolean isPowerOfThree1(int n) {
        return n > 0 && 1162261467%n == 0;
    }
    public boolean isPowerOfThree(int n) {
        if(n < 1)
            return false;
        while(n%3==0) {
            n=n/3;
        }
        return n==1;
    }
}
