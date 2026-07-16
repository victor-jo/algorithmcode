// Last updated: 2026. 7. 16. 오전 11:28:09
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos = nums1.length - 1;
        
        while (m > 0 && n > 0) {
            int leftN = nums1[m-1];
            int rightN = nums2[n-1];
            
            if (leftN > rightN) {
                nums1[pos] = leftN;
                --m;
            }
            else {
                nums1[pos] = rightN;
                --n;
            }
            --pos;
        }
        
        while (m > 0) {
            nums1[pos] = nums1[m-1];
            --m;
            --pos;
        }
        
        while (n > 0) {
            nums1[pos] = nums2[n-1];
            --n;
            --pos;
        }
    }
}