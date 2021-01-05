package Dec2020;

public class LeetCode415 {
    public String addStrings(String num1, String num2) {
        int c = 0,i = num1.length()-1,j = num2.length()-1;
        StringBuilder res = new StringBuilder();
        while(c > 0 || i >=0 || j >= 0){
            if(i>=0){
                c+=num1.charAt(i--)-'0';
            }
            if(j>=0){
                c+=num2.charAt(j--)-'0';
            }
            res.append(c%10);
            c/=10;
        }
        return res.reverse().toString();
    }
}
