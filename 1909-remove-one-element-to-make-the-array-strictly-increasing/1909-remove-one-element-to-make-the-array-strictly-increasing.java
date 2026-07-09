class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int prev = 0;
            boolean bool = false;

            for (int j = 0; j < n; j++) {
                if (i == j && i == 0) {
                    prev = 0;

                } else if (i == j) {
                    prev = nums[i - 1];
                } else if (i != j && nums[j] > prev) {
                    prev = nums[j];
                    bool = true;

                } else {
                    bool = false;
                    break;

                }

            }

            if (bool) {
                return true;

            }

        }

        return false;

    }
}