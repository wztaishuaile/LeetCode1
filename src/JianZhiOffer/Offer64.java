package JianZhiOffer;

/**
 * 主要利用||和&&的短路效应
 * 以及递归
 */
public class Offer64 {
    public int sumNums(int n) {
        boolean a=n>1&&(n+=sumNums(n-1))>0;
        return n;
    }
}
