package leetcode;

public class IslandPerimeter {

    private static final int VISIT = 2;

    public int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return islandPerimeter(grid, i, j);
                }
            }
        }
        return 0;
    }

    private int islandPerimeter(int[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length
         || grid[x][y] == 0) {
            return 1;
        }
        if (grid[x][y] == VISIT) {
            return 0;
        }
        grid[x][y] = VISIT;
        return islandPerimeter(grid, x+1, y) + islandPerimeter(grid, x, y+1)
            + islandPerimeter(grid, x-1, y) + islandPerimeter(grid, x, y-1);
    }
}
