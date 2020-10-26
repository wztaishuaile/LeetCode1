package Lsort;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode215 {
    public int findKthLargest1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();//小顶堆->第多少大的元素
        for(int x: nums){
            pq.add(x);
            if(pq.size()>k)
                pq.poll();
        }
        return pq.peek();
    }
    //大顶堆的写法

}
