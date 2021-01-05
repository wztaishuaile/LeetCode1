package Nov2020;

public class LeetCode134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int l=gas.length;
        int spare=0;
        int minSpare=Integer.MAX_VALUE;
        int minIndex=0;
        for(int i =0;i<l;i++){
            spare+=gas[i]-cost[i];
            if(spare<minSpare){
                minIndex=i;
                minSpare=spare;
            }
        }
        return spare<0?-1:(minIndex+1)%l;
    }
}
