class Solution {
    public int minMoves(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            maxValue = Math.max(nums[i], maxValue);

        }
        int movesTotal = 0;
        for (int i = 0; i < n; i++) {

            movesTotal = movesTotal + Math.abs(maxValue - nums[i]);

        }

        return movesTotal;

    }
}