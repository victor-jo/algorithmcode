package leetcode;

public class MaxAreaIsland {

    private int maxLongestIsland = 0;
    private int length = 0;
    private int m, n;

    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    length = 0;
                    maxAreaOfIsland(grid, i, j);
                    maxLongestIsland = Math.max(maxLongestIsland, length);
                }
            }
        }
        return maxLongestIsland;
    }

    private void maxAreaOfIsland(int[][] grid, int i, int j) {
        if (grid[i][j] == 1) {
            grid[i][j] = 0;
            if (i > 0) maxAreaOfIsland(grid, i-1, j);
            if (j > 0) maxAreaOfIsland(grid, i, j-1);
            if (i+1 < m) maxAreaOfIsland(grid, i+1, j);
            if (j+1 < n) maxAreaOfIsland(grid, i, j+1);
            ++length;
        }
    }
}
