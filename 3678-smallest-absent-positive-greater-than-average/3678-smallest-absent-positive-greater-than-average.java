class Solution {
    public int smallestAbsent(int[] nums) {

        int n = nums.length;
        int[] arr = new int[102];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            if (nums[i] >= 0) {
                arr[nums[i]] = 1;

            }

        }
        int average = sum / n;
        int absInt = -1;
        int start = average + 1;
        if (average < 0) {
            start = 1;

        }
        for (int i = start; i <= 101; i++) {
            if (arr[i] == 0) {
                absInt = i;
                break;
            }
        }
        return absInt;

    }
}