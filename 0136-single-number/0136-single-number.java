class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int xor = nums[0];
        for (int i = 1; i < n; i++) {
            xor = xor ^ nums[i];

        }

        return xor;

    }
}