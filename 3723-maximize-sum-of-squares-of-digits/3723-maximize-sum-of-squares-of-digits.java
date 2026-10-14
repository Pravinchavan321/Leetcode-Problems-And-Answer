class Solution {
    public String maxSumOfSquares(int num, int sum) {

        if (sum > num * 9) {
            return "";
        }
        StringBuilder ansSb = new StringBuilder();
        for (int i = 0; i < num; i++) {

            int digit = Math.min(9, sum);

            sum -= digit;
            ansSb.append(digit);

        }

        return ansSb.toString();
    }
}