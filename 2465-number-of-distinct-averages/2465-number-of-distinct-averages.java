class Solution {
    public int distinctAverages(int[] nums) {
        int n = nums.length;
        Set<Double> hashSet = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < (n / 2); i++) {
            double average = ((double) (nums[i] + nums[n - i - 1])) / 2;
            hashSet.add(average);

        }

        return hashSet.size();

    }
}