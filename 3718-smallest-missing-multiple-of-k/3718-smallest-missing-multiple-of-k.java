class Solution {
    public int missingMultiple(int[] nums, int k) {

        int n = nums.length;
        Set<Integer> hashSet = new HashSet<>();

        for (int i : nums) {
            hashSet.add(i);
        }

        int i = 1;
        while (hashSet.contains(i * k)) {
            i++;

        }

        return (i * k);
    }
}