package Dec2020;

public class LeetCode168 {
    public static void main(String[] args) {
        LeetCode168 l = new LeetCode168();
        System.out.println(l.convertToTitle(98));

    }
    public String convertToTitle1(int n) {
        if(n == 0)
            return "";
        n--;
        return convertToTitle(n / 26)+(char)(n%26 + 'A');
    }
    public String convertToTitle(int n){
        StringBuilder res = new StringBuilder();
        while(n>0){
            n--;
            res.append((char)(n%26 + 'A'));
            n/=26;
        }
        return res.reverse().toString();
    }
}
