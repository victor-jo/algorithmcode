// Last updated: 2026. 7. 16. 오전 11:29:03
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n = nums1.length;
        int m = nums2.length;

        int low = 0;
        int high = n;

        while (low <= high) {
            int midX = (low + high) / 2;
            int midY = (n + m + 1) / 2 - midX;

            int maxLeftX = (midX == 0) ? Integer.MIN_VALUE : nums1[midX - 1];
            int minRightX = (midX == n) ? Integer.MAX_VALUE : nums1[midX];

            int maxLeftY = (midY == 0) ? Integer.MIN_VALUE : nums2[midY - 1];
            int minRightY = (midY == m) ? Integer.MAX_VALUE : nums2[midY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((n + m) % 2 == 0) {
                    return (double) (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else {
                    return (double) Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                high = midX - 1;
            } else {
                low = midX + 1;
            }
        }

        return 0.0;
    }
}