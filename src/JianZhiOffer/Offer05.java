package JianZhiOffer;

public class Offer05 {
    //慢且费时
    public String replaceSpace(String s) {
        StringBuilder a = new StringBuilder();
        for (Character x : s.toCharArray()) {
            if (x == ' ')//单引号写charater
                a.append("%20");
            else
                a.append(x);//不能用引号！

        }
        return a.toString();
    }
}
