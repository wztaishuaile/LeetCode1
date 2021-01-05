package Dec2020;

public class LeetCode405 {
    public String toHex(int num) {
        if(num == 0)
            return "0";
        char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
                'f'};
        StringBuilder res = new StringBuilder();
        while (num>0){
            res.append(a[num&0xf]);
            num = num>>>4;
        }
        return res.reverse().toString();
    }
}
