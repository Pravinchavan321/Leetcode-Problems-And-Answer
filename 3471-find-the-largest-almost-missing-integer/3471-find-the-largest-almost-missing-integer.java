class Solution {
    public int largestInteger(int[] nums, int k) {

        int[] arr = new int[51];
        int n = nums.length;
        if (n < k) {
            return -1;
        }
        for (int i = 0; i <= n - k; i++) {
            for (int j = i; j < i + k; j++) {
                arr[nums[j]] = arr[nums[j]] + 1;

            }

        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 51; i++) {
            if(k == n && arr[i] != 0)
            {
                max = Math.max(max, i);
            }
            else if(k == 1 && arr[i] == 1)
            {
                max = Math.max(max, i);
                
            }
            else if(k != 1 && arr[i] == 1) {
                max = Math.max(max, i);
            }

        }

        return (max == Integer.MIN_VALUE) ? -1 : max;

    }
}