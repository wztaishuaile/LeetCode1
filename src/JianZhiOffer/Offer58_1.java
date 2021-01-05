package JianZhiOffer;

public class Offer58_1 {
    public String reverseWords1(String s) {
        if(s == null)
            return s;
        s=s.trim();//去除字符串首尾的空格
        int i=s.length()-1;int j = i;
        StringBuilder res = new StringBuilder();
        while(i>=0){
            while(i>=0&&s.charAt(i)!=' ') i--;
            res.append(s.substring(i+1,j+1)+' ');//substring前面索引包含后面那个不包含
            while(i>=0 && s.charAt(i) == ' ') i--;
            j=i;
        }
        return res.toString().trim();
    }
    public String reverseWords(String s) {
        String[] strs = s.trim().split(" ");//这里是双引号
        StringBuilder res = new StringBuilder();
        for(int i=strs.length-1;i>=0;i--){
            if(strs[i].equals(""))//这里用equals而非等号，遇到空字符，则跳过
                continue;
            res.append(strs[i]+" ");
        }
        return res.toString().trim();
    }
}
