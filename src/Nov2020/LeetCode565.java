package Nov2020;

public class LeetCode565 {
    public int arrayNesting(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != -1){
                int m = help(nums,i);
                max = Math.max(max,m);
            }
        }
        return max;
    }
    public int help(int[] nums,int start){
        int next = start;
        int res = 0;
        do{
            int temp = nums[next];
            nums[next] = -1;
            next = temp;
            res++;
        }while(next!=start);
        return res;
    }
}
