class Solution {
    public int findLengthOfLCIS(int[] nums) {

        int n = nums.length;
        int maxLen = 1;
        int i = 0;

        for (int j = 1; j < n; j++) {

            if (nums[j] <= nums[j - 1]) {
                maxLen = Math.max(maxLen, j - i);
                i = j;

            }
            if (j == n - 1) {
                maxLen = Math.max(maxLen, j - i + 1);

            }

        }

        return maxLen;

    }
}