package Nov2020;

public class LeetCode693 {
    public boolean hasAlternatingBits(int n) {
        n=n^(n>>1);
        return (n&(n+1))==0;
    }
}
