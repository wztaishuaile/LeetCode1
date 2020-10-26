package greedyAlgorithm;

public class LeetCode665 {
    public boolean checkPossibility(int[] nums) {
        if(nums==null||nums.length<2)
            return true;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1])
                continue;
            else {
                count++;
                if(count>=2)
                    break;
                if(i>=1&&nums[i-1]>=nums[i+1]){
                    nums[i+1]=nums[i];
                }else{
                    nums[i]=nums[i+1];
                }
            }
        }
        return count>=2? false:true;

    }
}
