// Last updated: 2026. 7. 16. 오전 11:25:40
class Solution {
    static Map<Integer, List<Integer>> hash = new HashMap<>();

    static {
        for (int i=1; i<=1000; ++i) {
            List<Integer> factorList = new ArrayList<>();
            for (int j=1; j<=i; ++j) {
                if (i % j == 0) {
                    factorList.add(j);
                }
            }
            hash.put(i, factorList);
        }
    }

    public int kthFactor(int n, int k) {
        List<Integer> factorList = hash.get(n);
        if (factorList.size() < k) {
            return -1;
        }
        return factorList.get(k-1);
    }
}