package twoPointer;

public class LeetCode633 {
    public boolean judgeSquareSum(int c){
        int i=0,j=(int)Math.sqrt(c);
        //存在相等的两个数要带上等号
        while(i<=j){
            int sum=i*i+j*j;
            if(c==sum)
                return true;
            if(sum<c)
                i++;
            else if(sum>c)
                j--;
        }
        return false;
    }
}
