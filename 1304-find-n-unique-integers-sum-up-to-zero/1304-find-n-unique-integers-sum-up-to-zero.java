class Solution {
    public int[] sumZero(int n) {

        if (n == 1) {
            return new int[] { 0 };

        }
        if (n == 2) {
            return new int[] { -1, 1 };

        }

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                res[i] = -((n - 2) * (n - 1) / 2);

            } else {

                res[i] = i - 1;
            }
        }

        return res;

    }
}