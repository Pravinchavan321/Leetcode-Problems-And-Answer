class Solution {
    public int totalMoney(int n) {

        int sum = 0;
        int remain = n;
        int tillElemSum = (n < 7) ? n : 7;
        int count = 0;

        while (remain > 0) {

            int days = Math.min(remain, 7);

            sum = sum + days * (2 * (count + 1) + (days - 1)) / 2;

            remain = remain - 7;
            count++;

        }

        return sum;
    }
}