class Solution {
    public int numSpecial(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        int[] colOneFreq = new int[n];
        for (int i = 0; i < m; i++) {
            int rowOne = 0;
            for (int j = 0; j < n; j++) {

                if (mat[i][j] == 1) {
                    rowOne++;
                    colOneFreq[j]++;
                }
                if (i == m - 1) {
                    if (colOneFreq[j] > 1) {
                        col[j] = false;

                    } else {
                        col[j] = true;
                    }
                }

            }
            if (rowOne > 1) {
                row[i] = false;

            } else {
                row[i] = true;
            }
        }
        int countPos = 0;
        int i = 0;

        while (i < m) {
            if (row[i] == false) {
                i++;
                continue;

            }
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && row[i] == true && col[j] == true) {
                    countPos++;

                }

            }
            i++;
        }

        return countPos;

    }
}