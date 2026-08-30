class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                indexMax = i;
                max = nums[i];

            }
            if (nums[i] < min) {
                indexMin = i;
                min = nums[i];
            }
        }

        int indexStart = Integer.MAX_VALUE;
        int indexLast = Integer.MAX_VALUE;
        if (indexMax <= indexMin) {

            indexStart = indexMax;
            indexLast = indexMin;

        } else {
            indexStart = indexMin;
            indexLast = indexMax;

        }

        int fromBoth = indexStart + 1 + (n - indexLast);
        int fromStart = indexStart + 1 + (indexLast - indexStart);
        int fromLast = (n - indexLast) + (indexLast - indexStart);
        return Math.min(fromBoth, Math.min(fromStart, fromLast));

    }
}