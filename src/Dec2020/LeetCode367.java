package Dec2020;

public class LeetCode367 {
    public boolean isPerfectSquare(int num) {
        int a = 1;
        while (num > 0) {
            num -= a;
            a = a + 2;
        }
        return num == 0;
    }
}
