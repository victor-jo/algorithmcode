class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i=0; i<matrix.length; ++i) {
            int length = matrix[i].length;
            if (matrix[i][0] <= target && matrix[i][length-1] >= target) {
                return searchBinarySearch(matrix[i], target);
            }
        }
        return false;
    }
    
    public boolean searchBinarySearch(int[] arr, int target) {
        int begin = 0;
        int end = arr.length - 1;
        
        while (begin <= end) {
            int mid = (begin + end) / 2;
            
            if (arr[mid] == target) {
                return true;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                begin = mid + 1;
            }
        }
        
        return false;
    }
}