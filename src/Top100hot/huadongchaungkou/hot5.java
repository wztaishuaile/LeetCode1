package Top100hot.huadongchaungkou;

public class hot5 {
    public String longestPalindrome(String s) {
        int length=s.length();
        if(length<2)
            return s;
        int maxLength=1,begin=0;
        for (int i = 0; i < length-1; i++) {
            for(int j=i+1;j<length;j++){
                if(j-i+1>maxLength&&isPalindrome(s,i,j)){
                    maxLength=j-i+1;
                    begin=i;
                }

            }
        }
        return s.substring(begin,begin+maxLength);

    }
    public boolean isPalindrome(String s,int i,int j){
        while(j>i){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            j--;
            i++;
        }
        return true;
    }

}
