class Solution {
    public int minimumRightShifts(List<Integer> nums) {

        int n = nums.size();
        int index = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
                index = i;

            }

        }
        int j = index;
        int stop = j - 1;
        if (j == 0) {
            stop = n - 1;

        }

        while (j != stop) {
            if (nums.get(j) > nums.get((j + 1) % n)) {
                return -1;

            }
            j = (j + 1) % n;
        }
        if (index == 0) {
            return 0;
        }

        return n - index;

    }
}