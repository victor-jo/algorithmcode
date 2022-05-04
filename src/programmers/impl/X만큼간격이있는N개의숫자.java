package programmers.impl;

import java.util.Arrays;

public class X만큼간격이있는N개의숫자 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long[] answer = solution.solution(-10000000, 1000);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }

    static class Solution {
        public long[] solution(int x, int n) {
            long[] answer = {};
            if (n > 0) {
                answer = new long[n];
            }
            for (int i=n; i>=1; --i) {
                answer[i-1] = ((long) x * i);
            }
            return answer;
        }
    }
}
