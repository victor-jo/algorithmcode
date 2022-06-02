package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PlatesCandles {

    private static final int NONE = -1;

    public int[] platesBetweenCandles(String s, int[][] queries) {
        List<Integer> bracketIndexList = new ArrayList<>();
        int[] prefixSums = new int[s.length()];

        if (s.charAt(0) == '*') {
            prefixSums[0] = 1;
        }
        else {
            bracketIndexList.add(0);
        }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                prefixSums[i] = prefixSums[i-1] + 1;
            }
            else {
                prefixSums[i] = prefixSums[i-1];
                bracketIndexList.add(i);
            }
        }

        int[] results = new int[queries.length];
        Integer[] bi = bracketIndexList.toArray(new Integer[0]);

        for (int i = 0; i < queries.length; i++) {
            int begin = findBracketIndex(bi, queries[i][0], true);
            int end = findBracketIndex(bi, queries[i][1], false);

            if (begin == NONE || end == NONE) {
                results[i] = 0;
            }
            else {
                results[i] = begin > end ? 0 : prefixSums[end] - prefixSums[begin];
            }
        }

        return results;
    }

    public int findBracketIndex(Integer[] bi, int t, boolean isLeft) {
        int begin = 0;
        int end = bi.length - 1;

        while (begin <= end) {
            int mid = (begin + end) >> 1;
            if (bi[mid] == t) {
                return bi[mid];
            }
            else if (bi[mid] < t) {
                begin = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        try {
            return isLeft ? bi[begin] : bi[end];
        }
        catch (IndexOutOfBoundsException e) {
            return NONE;
        }
    }
}
