//(1)
class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;

        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            hashSet.add(num);
        }
        if (n == 1) {
            return nums[0] + 1;
        }
        int countSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] + 1 == nums[i])
                countSum += nums[i];
            else
                break;
        }

        while (hashSet.contains(countSum)) {
            countSum++;
        }

        return countSum;
    }
}
