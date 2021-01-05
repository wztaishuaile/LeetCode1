package Nov2020;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode566 {
    //用队列来解决问题容易想到，但消耗的时间比较多。
    public int[][] matrixReshape1(int[][] nums, int r, int c) {
        if(nums.length==0||nums.length*nums[0].length!=r*c)
            return nums;
        int[][] res=new int[r][c];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                q.add(nums[i][j]);
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=q.poll();
            }
        }
        return res;
    }

    //不使用额外的空间，就是带上标志
    public int[][] matrixReshape2(int[][] nums, int r, int c){
        if(nums.length==0||nums.length*nums[0].length!=r*c)
            return nums;
        int[][] res=new int[r][c];
        int a=0,b=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[a][b]=nums[i][j];
                b++;
                if(b==c){
                    a++;
                    b=0;//重新置0不能忘
                }
            }
        }
        return res;
    }
    //取余数，取模找关系
    public int[][] matrixReshape(int[][] nums, int r, int c){
        if(nums.length==0||nums.length*nums[0].length!=r*c)
            return nums;
        int n=nums[0].length;
        int[][] res=new int[r][c];
        int index=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                res[i][j]=nums[index/n][index%n];
                index++;
            }
        }
        return res;
    }
}
