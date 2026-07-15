class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        Arrays.sort(nums);

        int maxLen = 1;
        int i = 1;

        int lastElem = nums[0];
        int count = 1;
        while (i < n) {
            if (nums[i] == lastElem) {
                i++;
            } else if (nums[i] == lastElem + 1) {
                count++;
                maxLen = Math.max(maxLen, count);
                lastElem = nums[i];
                i++;

            } else {
                count = 1;
                lastElem = nums[i];
                i++;

            }

        }

        return maxLen;

    }
}