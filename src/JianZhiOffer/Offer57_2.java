package JianZhiOffer;

import java.util.ArrayList;
import java.util.List;
//滑动窗口！
public class Offer57_2 {
    public int[][] findContinuousSequence(int target) {
        int i = 1;int j = 1;
        List<int[]> res = new ArrayList<>();
        int sum = 0;
        //=注意等号，因为是整型。
        while(i<=target/2){
            if(sum<target){
                sum+=j;
                j++;
            }else if(sum>target){
                sum-=i;
                i++;
            }else{
                int[] temp = new int[j-i];
                for(int k=i;k<j;k++){
                    temp[k-i]=k;
                }
                res.add(temp);
                sum-=2*i+1;
                i+=2;//这样优化一下，因为必然i+1的情况是无解的
//                sum-=i;
//                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
