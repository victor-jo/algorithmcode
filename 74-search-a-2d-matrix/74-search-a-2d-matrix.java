class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int begin = 0;
        int end = matrix.length - 1;
        
        while (begin <= end) {
            int mid = (begin + end) / 2;
            int length = matrix[mid].length;
            
            if (matrix[mid][0] <= target && matrix[mid][length-1] >= target) {
                return searchBinarySearch(matrix[mid], target);
            }
            else if (matrix[mid][0] > target) {
                end = mid - 1;
            }
            else {
                begin = mid + 1;
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