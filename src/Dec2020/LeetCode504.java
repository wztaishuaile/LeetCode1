package Dec2020;

/**
 * 7进制 输入整数，字符串形式输出
 * @author wangzhuang
 * 用StringBuilder拼接，并反转字符串
 * 设置标志位
 */
public class LeetCode504 {
    public String convertToBase7(int num) {
        StringBuilder res = new StringBuilder();
        boolean flag = true;
        if(num == 0)
            return "0";
        if(num < 0){
            num = -num;
            flag = false;
        }
        while(num > 0){
            res.append(num%7);
            num /=7;
        }
        return flag?res.reverse().toString():res.append("-").reverse().toString();
    }
}
