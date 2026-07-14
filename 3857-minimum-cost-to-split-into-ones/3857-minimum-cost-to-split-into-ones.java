class Solution {
    public int minCost(int n) {

        int no = n;
        int sum = 0;
        while (no >= 1) {
            sum = sum + (--no);

        }

        return sum;

    }
}