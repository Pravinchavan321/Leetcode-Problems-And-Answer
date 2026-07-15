class Solution {

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public int gcdOfOddEvenSums(int n) {

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= (2 * n); i = i + 2) {
            oddSum = oddSum + i;
            evenSum = evenSum + (i + 1);

        }

        return gcd(oddSum, evenSum);

    }
}