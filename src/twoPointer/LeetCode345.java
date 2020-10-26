package twoPointer;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCode345{
    private final static HashSet<Character> v=new HashSet<>(Arrays.asList('a','A','e','E','i','I','o','O','u','U'));
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char[] res=new char[s.length()];
        //=也把空字符这种情况给包含进去了
        while(i<=j) {
            char ci=s.charAt(i);
            char cj=s.charAt(j);
            if(!v.contains(ci))
                res[i++]=ci;
            if(!v.contains(cj))
                res[j--]=cj;
            else if(v.contains(ci)&&v.contains(cj)){
                res[j--]=ci;
                res[i++]=cj;
            }
        }
        return new String(res);
    }
}
