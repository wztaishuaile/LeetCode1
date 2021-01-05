package Nov2020;

public class LeetCode338 {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for(int i=0;i<num+1;i++){
            res[i]=help(i);
        }
        return res;
    }
    public int help(int x){
        int res=0;
        while(x!=0){
            x&=x-1;
            res++;
        }
        return res;
    }
}
