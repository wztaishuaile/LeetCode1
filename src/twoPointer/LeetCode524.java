package twoPointer;

import java.util.List;

public class LeetCode524 {
    public String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        for (String target : d) {
            int i = longestWord.length(), j = target.length();
            //compareTo(String s)按照字典顺序比较两个字符串
            if (i > j || (i == j && longestWord.compareTo(target) < 0))
                continue;//跳出循环了
            if (isSubstr(s, target))
                longestWord = target;
        }
        return longestWord;
    }
    private boolean isSubstr(String s,String target){
        int i=0,j=0;
        while(i<s.length()&&j<target.length()){
            if(s.charAt(i)==target.charAt(j)){
                j++;
            }
            i++;
        }
        return j==target.length();
    }
}
