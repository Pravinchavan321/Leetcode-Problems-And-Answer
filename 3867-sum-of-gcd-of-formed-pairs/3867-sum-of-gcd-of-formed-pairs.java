class Solution {
    public long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public long gcdSum(int[] nums) {

        int n = nums.length;

        long[] prefixGcd = new long[n];

        long mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(nums[i] > mx)
            {
                mx = nums[i];

            }
            

            prefixGcd[i] = gcd(mx, nums[i]);

        }
        Arrays.sort(prefixGcd);

        int i = 0;
        int j = n - 1;
        long sum = 0;
        while (i < j) {
            sum = sum + gcd(prefixGcd[i++], prefixGcd[j--]);

        }

        return sum;

    }
}