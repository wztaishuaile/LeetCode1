package Top100hot.huadongchaungkou;

import java.util.HashMap;

public class hot3 {
    public static void main(String[] args) {
        HashMap<String, Integer>  map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("a",4);

        System.out.println(map);
    }
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;
        int res=0;
        for (int i = 0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i)))
                left=Math.max(left,map.get(s.charAt(i))+1);
            map.put(s.charAt(i),i);
            res=Math.max(res,i-left+1);
        }
        return res;
    }
}
