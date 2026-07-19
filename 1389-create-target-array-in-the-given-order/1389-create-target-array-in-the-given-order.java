class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int n = index.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = n - 2; j >= index[i]; j--) {
                res[j + 1] = res[j];

            }
            res[index[i]] = nums[i];

        }

        return res;

    }
}