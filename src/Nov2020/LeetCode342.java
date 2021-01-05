package Nov2020;

public class LeetCode342 {
    public static void main(String[] args) {
        LeetCode342 a = new LeetCode342();
        System.out.println( a.isPowerOfFour(16));
    }
    public boolean isPowerOfFour(int num) {
        return (num > 0) && ((num & (num - 1)) == 0) && (num % 3 == 1);
    }
    public boolean isPowerOfFour1(int num) {
        return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555)!=0);
    }
}
