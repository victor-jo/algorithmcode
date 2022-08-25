class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int[][] arr = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < i+1; j++) {
                if (i == j || j == 0) {
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                line.add(arr[i][j]);
            }
            result.add(Collections.unmodifiableList(line));
        }
        return result;
    }
}