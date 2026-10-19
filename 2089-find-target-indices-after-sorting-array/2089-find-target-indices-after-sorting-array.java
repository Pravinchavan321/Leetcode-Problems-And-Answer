class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> ansList = new ArrayList();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                ansList.add(i);
            }
        }

        return ansList;

    }
}