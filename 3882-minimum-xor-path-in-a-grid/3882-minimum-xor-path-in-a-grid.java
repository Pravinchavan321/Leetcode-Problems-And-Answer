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

import java.util.*;

class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Set<Integer>[][] dp = new HashSet[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = new HashSet<>();
            }
        }

        dp[0][0].add(grid[0][0]);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    continue;
                }

                if (i > 0) {
                    for (int x : dp[i - 1][j]) {
                        dp[i][j].add(x ^ grid[i][j]);
                    }
                }

                if (j > 0) {
                    for (int x : dp[i][j - 1]) {
                        dp[i][j].add(x ^ grid[i][j]);
                    }
                }
            }
        }

        return Collections.min(dp[m - 1][n - 1]);
    }
}
