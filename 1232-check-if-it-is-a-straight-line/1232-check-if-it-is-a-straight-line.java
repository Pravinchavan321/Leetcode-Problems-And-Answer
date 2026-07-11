class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        int n = coordinates.length;

        if (n == 2) {
            return true;
        }

        int diffX = coordinates[1][0] - coordinates[0][0];
        int diffY = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < n; i++) {

            int diffXCheck = coordinates[i][0] - coordinates[0][0];
            int diffYCheck = coordinates[i][1] - coordinates[0][1];

            if ((diffY * diffXCheck) != (diffYCheck * diffX)) {
                return false;
            }
        }

        return true;
    }
}