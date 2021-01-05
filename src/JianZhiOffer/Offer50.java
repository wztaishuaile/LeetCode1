package JianZhiOffer;

public class Offer50 {
    public char firstUniqChar(String s) {
        int[] target=new int[26];
        for(int i=0;i<s.length();i++){
            target[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(target[s.charAt(i)-'a']==1)
                return s.charAt(i);
        }
        return ' ';
    }

}
