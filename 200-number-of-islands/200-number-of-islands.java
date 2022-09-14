class Solution {
    int n, m;
    
    public int numIslands(char[][] grid) {
        n = grid.length;
        m = grid[0].length;
        
        int count = 0;
        
        for (int i=0; i<n; ++i) {
            for (int j=0; j<m; ++j) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count += 1;
                }
            }
        }
        return count;
    }
    
    public void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return;
        }
        if (grid[i][j] != '1') {
            return;
        }
        
        grid[i][j] = 'X';
        
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}