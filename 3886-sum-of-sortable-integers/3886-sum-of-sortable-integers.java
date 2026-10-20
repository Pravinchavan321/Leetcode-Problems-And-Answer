class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int[] s = nums.clone();
        Arrays.sort(s);

        int result = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0)
                continue;

            boolean sortable = true;
            for (int i = 0; i < n && sortable; i += k) {
                if (!isRotation(nums, s, i, k))
                    sortable = false;
            }

            if (sortable)
                result += k;
        }

        return result;
    }

    // O(k) — KMP: search s[start..start+k-1] in doubled nums block
    private boolean isRotation(int[] nums, int[] s, int start, int k) {
        // Build KMP failure function on pattern = s[start..start+k-1]
        int[] fail = new int[k];
        for (int i = 1; i < k; i++) {
            int j = fail[i - 1];
            while (j > 0 && s[start + i] != s[start + j])
                j = fail[j - 1];
            if (s[start + i] == s[start + j])
                j++;
            fail[i] = j;
        }

        // Search pattern in virtual doubled text: nums[start..start+k-1] × 2
        int j = 0;
        for (int i = 0; i < 2 * k; i++) {
            int c = nums[start + i % k]; // i % k → virtual doubling
            while (j > 0 && c != s[start + j])
                j = fail[j - 1];
            if (c == s[start + j])
                j++;
            if (j == k)
                return true;
        }
        return false;
    }
}