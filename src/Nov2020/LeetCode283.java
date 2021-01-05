package Nov2020;

public class LeetCode283 {
    //两次遍历一次将为0的元素给清除，非零元素按顺序排列，排完之后后面的元素补零即可
    public void moveZeroes1(int[] nums){
        if(nums==null)
            return;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }
    }

    //一次遍历类似快排的思想
    public void moveZeroes(int[] nums){
        if(nums==null)
            return;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j++]=temp;//交换并且指针右移一位
            }
        }
    }

}
