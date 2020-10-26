package day;

import java.util.Arrays;

public class leetcode977 {
    public int[] sortedSquares(int[] A) {
        int[] res=new int[A.length];
        for(int i=0;i<A.length;i++){
            res[i]=A[i]*A[i];
        }
        Arrays.sort(res);
        return res;
    }
    public int[] sortedSquares1(int[] A){
        int n=A.length;
        int[] res=new int[n];
        //判断条件带等号，最后剩下的那个元素也得提交上去。
        for(int i=0,j=n-1,cur=n-1;i<=j;){
            if(A[i]*A[i]>A[j]*A[j]){
                res[cur]=A[i]*A[i];
                i++;
            }
            else if(A[i]*A[i]<=A[j]*A[j]){
                res[cur]=A[j]*A[j];
                j--;
            }
            cur--;
        }
        return res;
    }
}
