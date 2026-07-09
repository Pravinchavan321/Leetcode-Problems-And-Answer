class Solution {

    public int signFunc(int signCount) {
        if (signCount % 2 == 0) {
            return 1;
        } else if (signCount % 2 != 0) {
            return -1;
        }
        return 0;

    }

    public int arraySign(int[] nums) {

        int signCount = 0;

        for (int num : nums) {
            if (num < 0) {
                signCount++;
            } else if (num == 0) {
                return 0;

            }
        }

        return signFunc(signCount);

    }
}