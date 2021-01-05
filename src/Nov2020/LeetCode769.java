package Nov2020;

public class LeetCode769 {
    public int maxChunksToSorted(int[] arr) {
        int res = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
            if(i==max) res++;
        }
        return res;
    }
}
