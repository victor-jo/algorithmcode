class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        while (i < matrix.length && matrix[i][0] <= target) {
            ++i;
        }
        if (i != 0) {
            --i;
        }
        
        for (int j=0; j<matrix[i].length; ++j) {
            if (matrix[i][j] == target) {
                return true;
            }
        }
        return false;
    }
}