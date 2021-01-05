package Dec2020;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode649 {
    public String predictPartyVictory(String senate) {
        Queue<Integer> R = new LinkedList<>();
        Queue<Integer> D = new LinkedList<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {
            char c = senate.charAt(i);
            if (c == 'R') {
                R.offer(i);
            }
            if (c == 'D') {
                D.offer(i);
            }
        }
        while (!R.isEmpty() && !D.isEmpty()) {
            int a = R.remove();
            int b = D.remove();
            if (a < b) {
                R.offer(a + n);
            } else {
                D.offer(b + n);
            }
        }
        return R.isEmpty() ? "Dire" : "Radiant";
    }
}
