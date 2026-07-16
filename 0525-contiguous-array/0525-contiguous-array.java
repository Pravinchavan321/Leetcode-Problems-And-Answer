class Solution {
    public int findMaxLength(int[] nums) {

        int n = nums.length;

        int[] prefArr = new int[n + 1];
        prefArr[0] = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                prefArr[i + 1] = prefArr[i] - 1;
            } else {
                prefArr[i + 1] = prefArr[i] + 1;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;

        for (int j = 0; j <= n; j++) {

            if (map.containsKey(prefArr[j])) {
                maxLen = Math.max(maxLen, j - map.get(prefArr[j]));
            } else {
                map.put(prefArr[j], j);
            }

        }

        return maxLen;
    }
}