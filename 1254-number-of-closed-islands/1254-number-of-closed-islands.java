class Solution {
    public int closedIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Step 1: border se connected 0s ko sink karo
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 0)
                dfs(grid, i, 0);
            if (grid[i][cols - 1] == 0)
                dfs(grid, i, cols - 1);
        }
        for (int j = 0; j < cols; j++) {
            if (grid[0][j] == 0)
                dfs(grid, 0, j);
            if (grid[rows - 1][j] == 0)
                dfs(grid, rows - 1, j);
        }

        // Step 2: bache hue islands count karo
        int count = 0;
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (grid[i][j] == 0) {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void dfs(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length)
            return;
        if (grid[r][c] == 1)
            return; // water ya already visited

        grid[r][c] = 1; // visited mark (sink)

        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }
}