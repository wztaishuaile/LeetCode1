package Dec2020;

public class LeetCode204 {
    public int countPrimes(int n) {
        int res = 0;
        for (int i = 2; i < n; i++) {
            res+=help(i)?1:0;
        }
        return res;
    }
    public boolean help(int n){
        for(int i =2;i<Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
