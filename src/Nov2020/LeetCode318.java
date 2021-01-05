package Nov2020;

public class LeetCode318 {
    public static void main(String[] args) {
        String[] s = {"a","aa","aaa","aaaa"};
        LeetCode318 j = new LeetCode318();
        int w=j.maxProduct(s);
        System.out.println(w);

    }
    public int maxProduct(String[] words) {
        int n=words.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            for( char c:words[i].toCharArray()){
                res[i]|=1<<(c-'a');//这里使用|而非+
            }
        }
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((res[i] & res[j])==0){
                    max=Math.max(max,words[i].length()*words[j].length());
                }
            }
        }
        return max;
    }
}
