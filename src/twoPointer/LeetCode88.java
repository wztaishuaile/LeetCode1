package twoPointer;

public class LeetCode88 {
    public void merge(int[] nums1,int m,int[] nums2,int n){
        int i=m,j=n;
        int index=m+n-1;
        while(i>=0&&j>=0&&index>=0){
            if(nums1[i]>nums2[j])
                nums1[index--]=nums1[i--];
            else
                nums1[index--]=nums2[j--];
        }
        if(i<0){
            while(j>=0&&index>=0)
                nums1[index--]=nums2[j--];
        }
        if(j<0){
            while(i>=0&&index>=0)
                nums1[index--]=nums1[i--];
        }

    }
}
