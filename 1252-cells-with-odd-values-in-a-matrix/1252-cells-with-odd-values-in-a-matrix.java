//(1)

// class Solution {
//     public int oddCells(int m, int n, int[][] indices) {

//         int[][] arr = new int[m][n];
//         int iL = indices.length;
//         int odd = 0;
//         for (int i = 0; i < iL; i++) {
//             int row = indices[i][0];
//             int col = indices[i][1];
//             for (int i1 = 0; i1 < n; i1++) {
//                 arr[row][i1] = arr[row][i1] + 1;

//             }
//             for (int i2 = 0; i2 < m; i2++) {
//                 arr[i2][col] = arr[i2][col] + 1;

//             }
//             if (i == iL - 1) {
//                 for (int i3 = 0; i3 < m; i3++) {
//                     for (int j3 = 0; j3 < n; j3++) {
//                         if (arr[i3][j3] % 2 != 0) {
//                             odd++;
//                         }

//                     }
//                 }

//             }

//         }

//         return odd;

//     }
// }

//(2)

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] r = new int[m];
        int[] c = new int[n];

        for (int i = 0; i < indices.length; i++) {
            r[indices[i][0]]++;
            c[indices[i][1]]++;
        }

        int oddRows = 0;
        for (int i = 0; i < m; i++) {
            if (r[i] % 2 == 1) {
                oddRows++;
            }
        }

        int oddColumns = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] % 2 == 1) {
                oddColumns++;
            }
        }

        return oddRows * n + oddColumns * m - 2 * oddRows * oddColumns;
    }
}