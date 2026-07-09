class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;

        if (nums.length == 1) {
            return 0;
        }

        int[] arr = new int[n];
        arr[0] = nums[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + nums[i];

        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (((arr[n - 1] - arr[i]) / (n - i - 1)) < nums[i]) {
                count++;
            }

        }

        return count;

    }
}