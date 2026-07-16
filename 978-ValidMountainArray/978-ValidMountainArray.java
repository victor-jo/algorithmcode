// Last updated: 2026. 7. 16. 오전 11:26:07
class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean up = true;
        
        if (arr.length < 3) {
            return false;
        }
        
        for (int i=0; i<arr.length-1; ++i) {
            if (i == 0 && up && arr[i] >= arr[i+1]) {
                return false;
            }
            if (arr[i] >= arr[i+1]) {
                up = false;
            }
            if (!up && arr[i] <= arr[i+1]) {
                return false;
            }
        }
        
        return !up;
    }
}