class Solution {
    public boolean checkDivisibility(int n) {
        int n1 = n;
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        if (n1 % (sum + product) == 0) {
            return true;
        }

        return false;

    }
}