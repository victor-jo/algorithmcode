package leetcode;

import java.util.Arrays;

public class ColorBorder {

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        colorBordering(grid, row, col, grid[row][col]);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    grid[i][j] = color;
                }
            }
        }
        return grid;
    }

    private void colorBordering(int[][] grid, int r, int c, int old) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] != old) {
            return;
        }
        grid[r][c] = -old;
        colorBordering(grid, r+1, c, old);
        colorBordering(grid, r-1, c, old);
        colorBordering(grid, r, c+1, old);
        colorBordering(grid, r, c-1, old);
        if (r > 0 && c > 0 && r < grid.length-1 && c < grid[0].length-1
         && old == Math.abs(grid[r+1][c])
         && old == Math.abs(grid[r-1][c])
         && old == Math.abs(grid[r][c+1])
         && old == Math.abs(grid[r][c-1])) {
            grid[r][c] = old;
        }
    }
}
