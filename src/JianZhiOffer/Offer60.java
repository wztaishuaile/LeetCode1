package JianZhiOffer;

public class Offer60 {
    public double[] twoSum(int n) {
        double pre[] = {1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d};
        for (int i = 2; i <= n; i++) {
            double tmp[] = new double[5 * i + 1];
            for (int j = 0; j < pre.length; j++) {
                for (int a = 0; a < 6; a++) {
                    tmp[j + a] += pre[j] / 6;
                }
            }
            pre = tmp;//更新的位置
        }
        return pre;
    }
}
