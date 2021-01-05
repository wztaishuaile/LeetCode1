package JianZhiOffer;

import java.util.LinkedList;

public class Offer59_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||k<1||nums.length<k)
            return new int[0];
        int[] res=new int[nums.length-k+1];
        LinkedList<Integer> q=new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while(!q.isEmpty()&&q.peekLast()<nums[i])
                q.pollLast();
            q.add(nums[i]);


        }

        return res;
    }

}


