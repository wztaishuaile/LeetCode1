package twoPointer;

public class LeetCode680 {

    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return a(s,i++,j)||a(s,i,j--);
            i++;
            j--;
        }
        return true;
    }
    public boolean a(String s,int i,int j){
//        char[] cs=s.toCharArray();
//        while(i<=j){
//        if(cs[i++]!=cs[j--])
//            return false;
//        }
        //这样写好像快一些，内存消耗也少一些
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        }
        return true;
    }
}
