class Solution {

    public boolean isArrayEqual(int[] arr1, int[] arr2) {
        if (arr1[0] == arr2[0] && arr1[1] == arr2[1]) {
            return true;

        }

        return false;

    }

    public boolean isBoomerang(int[][] points) {
        int i = 0;
        int j = 1;
        int n = points.length;
        while (i < n - 1) {
            if (isArrayEqual(points[i], points[j])) {
                return false;
            }
            if (j == n - 1) {
                i++;
                j = i + 1;
            } else {
                j++;

            }

        }

        if ((points[1][1] - points[0][1]) * (points[2][0] - points[0][0]) == (points[1][0] - points[0][0])
                * (points[2][1]
                        - points[0][1])) {
            return false;
        }

        return true;

    }
}