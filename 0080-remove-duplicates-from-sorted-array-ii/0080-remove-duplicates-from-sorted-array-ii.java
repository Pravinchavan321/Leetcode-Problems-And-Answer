class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        int left = 0;
        int right = 0;
        int count = 0;
        int elem = nums[0];
        while (right < n) {
            if (elem == nums[right] && count < 2) {
                count++;
                nums[left++] = elem;
                right++;

            } else if (elem == nums[right] && count >= 2) {
                count++;
                right++;

            } else if (elem != nums[right]) {
                elem = nums[right];
                count = 1;
                nums[left] = nums[right];
                left++;
                right++;

            }

        }

        return left;

    }
}