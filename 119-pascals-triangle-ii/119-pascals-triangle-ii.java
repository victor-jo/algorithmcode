class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[][] arr = new Integer[rowIndex+1][rowIndex+1];
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = 0; j < i+1; j++) {
                if (i == j || j == 0) {
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }
        return List.of(arr[rowIndex]);
    }
}