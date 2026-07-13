class Solution {
    public int[][] onesMinusZeros(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int[] rowOne = new int[rows];
        int[] rowZero = new int[rows];
        int[] colOne = new int[cols];
        int[] colZero = new int[cols];

        for (int i = 0; i < rows; i++) {
            int countOne = 0;
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    countOne++;

                }

            }
            rowOne[i] = countOne;
            rowZero[i] = cols - countOne;
        }
        for (int i = 0; i < cols; i++) {
            int countOne = 0;
            for (int j = 0; j < rows; j++) {
                if (grid[j][i] == 1) {
                    countOne++;

                }

            }
            colOne[i] = countOne;
            colZero[i] = rows - countOne;
        }
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                grid[i][j] = rowOne[i] + colOne[j] - rowZero[i] - colZero[j];

            }

        }

        return grid;

    }
}