class Solution {
    public double average(int[] salary) {
        int N = salary.length;
        int[] sums = new int[N+1];
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i=N-1; i>-1; --i) {
            sums[i] = sums[i+1] + salary[i];
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
        }
        return (sums[0]-(min+max))/(N-2.0);
    }
}