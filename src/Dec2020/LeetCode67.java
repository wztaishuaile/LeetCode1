package Dec2020;

public class LeetCode67 {
    public String addBinary(String a, String b) {
        int c = 0, i = a.length() - 1, j = b.length() - 1;
        StringBuilder res = new StringBuilder();
        while (c == 1 || i >= 0 || j >= 0) {
            if (i >= 0 && a.charAt(i--) == '1') {
                c++;
            }
            //防止空指针异常
            if (j >= 0 && b.charAt(j--) == '1') {
                c++;
            }
            res.append(c % 2);
            c /= 2;
        }
        return res.reverse().toString();
    }
}
