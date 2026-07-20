class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        List<List<Integer>> twoDimList = new ArrayList<>();

        int m = grid.length;
        int n = grid[0].length;
        int[][] gridNew = new int[m][n];

        for (int k1 = 0; k1 < k; k1++) {

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == m - 1 && j == n - 1) {
                        gridNew[0][0] = grid[m - 1][n - 1];
                    } else if (j == n - 1) {
                        gridNew[i + 1][0] = grid[i][n - 1];
                    } else {
                        gridNew[i][j + 1] = grid[i][j];
                    }

                }
            }
            for (int i = 0; i < m; i++) {
                grid[i] = gridNew[i].clone();

            }

        }

        for (int i = 0; i < m; i++) {
            List<Integer> newRow = new ArrayList<>();

            for (int j = 0; j < n; j++) {

                newRow.add(grid[i][j]);
            }
            twoDimList.add(newRow);
        }

        return twoDimList;

    }
}