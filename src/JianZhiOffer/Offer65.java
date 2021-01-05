package JianZhiOffer;

public class Offer65 {
    //递归写法更容易理解
    public int add(int a,int b){
        if(b==0){
            return a;
        }
        return add(a^b,(a&b)<<1);
    }

    //循环写法，空间效率更高
    public int add1(int a,int b){
        while(b!=0){
            int c=(a&b)<<1;
            a=a^b;
            b=c;
        }
        return a ;
    }

    public static void main(String[] args) {
        Offer65 T = new Offer65();
        System.out.println(T.add(12,13));

    }
}
