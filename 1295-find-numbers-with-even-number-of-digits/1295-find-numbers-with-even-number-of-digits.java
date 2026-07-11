class Solution {
    public int findNumbers(int[] nums) {

        int n = nums.length;
        int countEven = 0;
        for (int i = 0; i < n; i++) {
            int no = nums[i];
            int countD = 0;
            while (no > 0) {
                countD++;
                no = no / 10;
            }
            if (countD % 2 == 0) {
                countEven++;
            }
        }

        return countEven;

    }
}