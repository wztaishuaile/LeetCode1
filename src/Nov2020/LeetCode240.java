package Nov2020;

public class LeetCode240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return false;
        int r=matrix.length;
        int c=matrix[0].length;
        int i=r-1;
        int j=0;
        while(i<r&&i>=0&&j<c&&j>=0){
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]>target){
                i--;
            }else
                j++;
        }
        return false;
    }
}
