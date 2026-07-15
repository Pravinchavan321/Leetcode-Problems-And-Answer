class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }

        int left = 1;
        int right = num;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSquare = (long) mid * mid;
            if (midSquare == num) {
                return true;

            }

            else if (midSquare > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return false;
        // 238
    }
}