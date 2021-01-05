package JianZhiOffer;

public class Offer53 {
    public int search(int[] nums, int target) {
        return helper(nums,target+1)-helper(nums,target);
    }
    public int helper(int[] nums,int a){
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int m=(i+j)/2;
            if(nums[m]>=a){
                j=m-1;
            }else{
                i=m+1;
            }
        }
        return i;
    }
}
