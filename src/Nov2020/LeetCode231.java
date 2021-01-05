package Nov2020;

public class LeetCode231 {
    public boolean isPowerOfTwo(int n) {
        return n>0&&Integer.bitCount(n)==1;
    }
    public boolean isPowerOfTwo1(int n) {
        return n>0&&(n&(n-1))==0;
    }
}
