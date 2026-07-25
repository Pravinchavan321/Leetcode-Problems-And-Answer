class Solution {
    public int maxProduct(int n) {

        int n1 = n;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        while (n1 > 0) {
            int digit = n1 % 10;
            if (digit > max1) {
                max2 = max1;
                max1 = digit;

            } else if (digit > max2) {
                max2 = digit;

            }
            n1 /= 10;
        }

        return max1 * max2;
    }
}