package Nov2020;

public class LeetCode476 {
    public int findComplement(int num) {
        if (num == 0)
            return 1;
        int f = 1 << 30;
        while ((f & num) == 0) f >>= 1;
        f = (f << 1) - 1;
        return f ^ num;
    }
}
