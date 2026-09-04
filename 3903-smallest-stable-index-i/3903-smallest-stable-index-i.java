class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ansIndex = -1;
        int n = nums.length;
        int minArrayRight[] = new int[n];
        int maxArrayLeft[] = new int[n];
        int maxLeft = Integer.MIN_VALUE;
        int minRight = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > maxLeft) {
                maxLeft = nums[i];
            }
            if (nums[n - i - 1] < minRight) {
                minRight = nums[n - i - 1];
            }
            maxArrayLeft[i] = maxLeft;
            minArrayRight[n - i - 1] = minRight;

        }

        for (int i = 0; i < n; i++) {
            if (maxArrayLeft[i] - minArrayRight[i] <= k) {
                ansIndex = i;
                break;
            }
        }

        return ansIndex;

    }
}