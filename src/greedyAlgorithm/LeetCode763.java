package greedyAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class LeetCode763 {
    public List<Integer> partitionLabels(String S) {
        int[] last=new int[26];
        for(int i=0;i<S.length();i++)
            last[S.charAt(i)-'a']=i;

        int start=0,j=0;
        List <Integer> res=new ArrayList<Integer>();
        for(int i=0;i<S.length();i++){
            j=Math.max(j,last[S.charAt(i)-'a']);
            if(i==j){
                res.add(i-start+1);
                start=i+1;
            }
        }
        return res;
    }
}
