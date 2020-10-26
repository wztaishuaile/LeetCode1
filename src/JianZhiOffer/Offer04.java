package JianZhiOffer;

public class Offer04 {
    public static void main(String[] args) {

    }

    //暴力解法
    public boolean findNumberIn2DArray1(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (target == matrix[i][j])
                    return true;
            }
        }
        return false;
    }

    //右上角，左下角也行，就是一个方向提供增减，横纵各代表增减
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = 0;
        int col = matrix[0].length - 1;
        int i = 0;
        int j = col;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] < target)
                i++;
            else if (matrix[i][j] > target)
                j--;
            else
                return true;
        }
        return false;
    }
}
