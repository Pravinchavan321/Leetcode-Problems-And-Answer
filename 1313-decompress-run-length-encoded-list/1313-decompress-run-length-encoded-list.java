class Solution {
    public int[] decompressRLElist(int[] nums) {

        int n = nums.length;
        int total = 0;
        for (int i = 0; i < n; i += 2) {

            total += nums[i];

        }

        int[] res = new int[total];
        int idx = 0;

        for (int i = 0; i < n; i += 2) {
            int freqCount = nums[i];
            int num = nums[i + 1];
            while (freqCount > 0) {
                res[idx++] = num;
                freqCount--;
            }
        }

        return res;

    }
}