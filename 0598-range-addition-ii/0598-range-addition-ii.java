// class Solution {
//     public int maxCount(int m, int n, int[][] ops) {

//         int[][] mat = new int[m][n];
//         int opsLen = ops.length;
//         int max = 0;
//         for (int i = 0; i < opsLen; i++) {
//             int rows = ops[i][0];
//             int cols = ops[i][1];
//             for (int j = 0; j < rows; j++) {
//                 for (int k = 0; k < cols; k++) {
//                     mat[j][k] += 1;
//                     if (mat[j][k] > max) {
//                         max = mat[j][k];
//                     }

//                 }
//             }

//         }
//         int count = 0;
//         for (int j = 0; j < m; j++) {
//             for (int k = 0; k < n; k++) {

//                 if (mat[j][k] == max) {
//                     count++;
//                 }

//             }
//         }

//         return count;

//     }
// }

class Solution {
    public int maxCount(int m, int n, int[][] ops) {

        // Initially, the whole matrix is the overlapping region
        int a = m;
        int b = n;

        // Find the smallest row and column boundaries
        for (int[] ar : ops) {
            a = Math.min(a, ar[0]);
            b = Math.min(b, ar[1]);
        }

        // Cells inside the common intersection have the maximum value
        return a * b;
    }
}

