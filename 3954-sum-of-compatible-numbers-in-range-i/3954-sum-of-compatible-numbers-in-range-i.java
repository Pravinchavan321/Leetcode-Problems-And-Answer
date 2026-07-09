class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;
        int i = n - k;
        int j = n + k;
        if (i < 0) {
            i = 1;
        }
        while (i <= j) {
            if ((n & i) == 0) {
                sum = sum + i;

            }

            i++;

        }

        return sum;

    }
}