package Nov2020;

public class LeetCode190 {
    public static void main(String[] args) {
        LeetCode190 T = new LeetCode190();
        System.out.println(T.reverseBits(4));
    }
    //位操作注意括号的使用
    public int reverseBits1(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) + (n & 1);
            n = n >> 1;
        }
        return res;
    }
    //<<和<<<就是补位不一样逻辑位移就是补0
    public int reverseBits(int n){
        int res=0;
        for(int i=0 ;i<32;i++){
            res<<=1;
            res|=n&1;
            n>>>=1;//n>>=1这样写貌似也行
        }
        return res;
    }

}
