package Nov2020;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode378 {
    public int kthSmallest1(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] temp = new int[row*col];
        int index = 0;
        for(int[] a:matrix){
            for(int x:a){
                temp[index++]=x;
            }
        }
        Arrays.sort(temp);
        return temp[k-1];
    }
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{matrix[i][0], i, 0});
        }
        for (int i = 0; i < k - 1; i++) {
            int[] now = pq.poll();
            if (now[2] != n - 1) {
                pq.offer(new int[]{matrix[now[1]][now[2] + 1], now[1], now[2] + 1});
            }
        }
        return pq.poll()[0];
    }

    public static void main(String[] args) {
        LeetCode378 t = new LeetCode378();
        int [][] m={{1,  5,  9},{10, 11, 13},{12, 13, 15}};
        System.out.println(t.kthSmallest(m,9));

    }
    public int kthSmallest11(int[][] matrix, int k) {
        int n = matrix.length;
        int[] res = new int[n*n];
        int index = 0;
        for(int[] temp : matrix) {
            for(int x : temp) {
                res[index++] = x;
            }
        }
        Arrays.sort(res);
        return res[k-1];
    }



}
