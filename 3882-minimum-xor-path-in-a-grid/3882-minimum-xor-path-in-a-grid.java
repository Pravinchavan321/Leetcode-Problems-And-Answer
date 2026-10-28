//(1) NOT CORRECT PERFECTLY

// class Solution {
//     public int minCost(int[][] grid) {

//         int m = grid.length;
//         int n = grid[0].length;

//         int i = 0;
//         int j = 0;
//         int ansMin = grid[0][0];

//         while (i < m - 1 || j < n - 1) {

//             boolean isNextRow = (i + 1 < m);
//             boolean isNextCol = (j + 1 < n);

//             if (isNextRow && isNextCol) {

//                 if ((ansMin ^ grid[i][j + 1]) <= (ansMin ^ grid[i + 1][j])) {

//                     ansMin ^= grid[i][j + 1];
//                     j++;

//                 } else {

//                     ansMin ^= grid[i + 1][j];
//                     i++;
//                 }

//             } else if (isNextCol) {

//                 ansMin ^= grid[i][j + 1];
//                 j++;

//             } else {

//                 ansMin ^= grid[i + 1][j];
//                 i++;
//             }
//         }

//         return ansMin;
//     }
// }

//(2)


class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][][] dp = new boolean[m][n][1024];

        dp[0][0][grid[0][0]] = true;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    continue;
                }

                int val = grid[i][j];

                if (i > 0) {
                    for (int x = 0; x < 1024; x++) {
                        if (dp[i - 1][j][x]) {
                            dp[i][j][x ^ val] = true;
                        }
                    }
                }

                if (j > 0) {
                    for (int x = 0; x < 1024; x++) {
                        if (dp[i][j - 1][x]) {
                            dp[i][j][x ^ val] = true;
                        }
                    }
                }
            }
        }

        for (int x = 0; x < 1024; x++) {
            if (dp[m - 1][n - 1][x]) {
                return x;
            }
        }

        return -1;
    }
}
