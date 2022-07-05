class Solution {
    public int countOdds(int low, int high) {
        int hi = high%2 == 1 ? ((high+1)/2) : (high/2);
        int lo = low%2 == 1 ? ((low+1)/2) : (low/2);
        return low%2 == 1 ? hi-lo+1 : hi-lo;
    }
}