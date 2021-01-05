package JianZhiOffer;

import java.util.Arrays;
import java.util.HashSet;

public class Offer61 {
    public boolean isStraight1(int[] nums){
        //关于最值的处理，值得借鉴，小的赋大的初值，大的赋小的初值
        int min = 14; int max = 0;
        HashSet<Integer> repeat = new HashSet<>();
        for(int x : nums){
            if(x == 0)
                continue;
            max=Math.max(max,x);
            min=Math.min(min,x);
            if(repeat.contains(x))
                return false;
            repeat.add(x);
        }
        return max-min<5;
    }
    public boolean isStraight(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0;i<4;i++){
            if(nums[i]==0){
                count++;
            }
            else if(nums[i]==nums[i++]){
                return false;
            }
        }
        return nums[4]-nums[count]<5;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5};
        Offer61 T = new Offer61();
        System.out.println(T.isStraight(nums));

    }

}
