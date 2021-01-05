package JianZhiOffer;

public class Offer58_2 {
    //调用api
    public String reverseLeftWords1(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }
    //一次申请内存，耗时多
    public String reverseLeftWords2(String s,int n) {
        StringBuilder res = new StringBuilder();
        //取余的写法比两个循环代码要简洁些
        for(int i=n;i< n+s.length() ;i++){
            res.append(s.charAt((i+s.length())%s.length()));
        }
        /*等价于
            for (int i = n; i < s.length(); i++) {
                res.append(s.charAt(i));
            }
            for (int i = 0; i < n; i++) {
                res.append(s.charAt(i));
            }
         */
        return res.toString();
    }

    //多次申请内存，更慢
    public String reverseLeftWords3(String s,int n) {
        String res = new String();
        for (int i = n; i < n + s.length(); i++) {
            res += s.charAt((i + s.length()) % s.length());
        }
        return res;

    }
}
