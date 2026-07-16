// Last updated: 2026. 7. 16. 오전 11:27:05
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int begin = 1;
        int end = n;

        while (begin < end) {
            int mid = ((begin >> 1) + (end >> 1));
            if (isBadVersion(mid)) {
                end = mid - 1;
            }
            else {
                begin = mid + 1;
            }
        }

        return isBadVersion(end) ? end : end + 1;
    }
}