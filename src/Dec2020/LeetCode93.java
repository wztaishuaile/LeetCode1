package Dec2020;

import java.util.ArrayList;
import java.util.List;

public class LeetCode93 {

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        dfs(0,temp,res,s);
        return res;
    }

    private void dfs(int k,StringBuilder temp,List<String> res,String s){
        if(k==4||s.length()==0){
            if(k==4&&s.length()==0)
                return;
        }
        for(int i =0;i<s.length()&&i<=2;i++){
            if(i!=0&&s.charAt(0)=='0')
                break;
            String part = s.substring(0,i+1);
            if(Integer.valueOf(part)<=255) {
                if(temp.length()!=0){
                    part = "."+part;
                }
                temp.append(part);
                dfs(k+1,temp,res,s.substring(i+1));
                temp.delete(temp.length()-part.length(),temp.length());
            }
        }
    }

}
