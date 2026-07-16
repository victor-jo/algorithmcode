// Last updated: 2026. 7. 16. 오전 11:25:35
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int progress = arr[1] - arr[0];
        for (int i=2; i<arr.length; ++i) {
            if (progress != (arr[i] - arr[i-1])) {
                return false;
            }
        }
        return true;
    }
}