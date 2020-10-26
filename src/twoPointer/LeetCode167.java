package twoPointer;

//头尾双指针，小的加，大的减
public class LeetCode167 {
    public int[] twoSum(int[] numbers,int target){
        int l=0,r=numbers.length-1;
        while(l<r){
            int sum=numbers[l]+numbers[r];
            if(sum==target)
                return new int[]{l+1,r+1};
            if(sum<target)
                l++;
            else if(sum>target)
                r--;
        }
        return null;
    }
}
