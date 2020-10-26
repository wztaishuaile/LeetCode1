package greedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode452 {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0)
            return 0;
        Arrays.sort(points,new Comparator<int[]>(){
            public int compare(int[] o1,int[] o2){
                if ((long)o1[1]>(long)o2[1]){
                    return -1;
                }else if ((long)o1[1]==(long)o2[1]){
                    return 0;
                }else {
                    return 1;
                }
            }
        });
        int end=points[0][1];
        int count=1;
        for(int i=1;i<points.length;i++){
            if(points[i][0]<=end){
                continue;
            }
            end=points[i][1];
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode452 leetCode452 = new LeetCode452();
        int[][] a={{-2147483646,-2147483645},{2147483646,2147483647}};
        int minArrowShots = leetCode452.findMinArrowShots(a);
        System.out.println(minArrowShots);
        if (-2147483645<2147483647){
            System.out.println(true);
        }
    }
}
