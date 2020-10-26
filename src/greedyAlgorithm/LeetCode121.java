package greedyAlgorithm;

public class LeetCode121 {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int sofarMin=prices[0];
        int max=0;
        //int i =0;怎么能不初始化呢
        for(int i=0;i<prices.length;i++){
            if(sofarMin>prices[i]){
                sofarMin=prices[i];
            }
            else{
                max=Math.max(max,prices[i]-sofarMin);
            }
        }
        return max;
    }
}
