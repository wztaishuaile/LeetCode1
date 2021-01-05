package Dec2020;

import java.util.HashMap;
import java.util.Map;

public class LeetCode697 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();
        Map<Integer,Integer> maxIndex = new HashMap<>();
        Map<Integer,Integer> minIndex = new HashMap<>();
        int maxCount = 0;
        for(int i = 0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],1)+1);
            maxCount = Math.max(maxCount,count.get(nums[i]));
            maxIndex.put(nums[i],i);
            if(!minIndex.containsKey(nums[i])){
                minIndex.put(nums[i],i);
            }
        }
        int res = nums.length;
        for(int x: nums){
            if(count.get(x)!=maxCount)
                continue;
            res = Math.min(res,maxIndex.get(x)-minIndex.get(x)+1);
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode697 T = new LeetCode697();
        int[] a={1,2,2,3,4,3,2,7,5};
        System.out.println(T.findShortestSubArray(a));
    }
}
