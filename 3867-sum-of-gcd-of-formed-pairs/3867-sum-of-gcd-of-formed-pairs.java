
//(1)

// class Solution {
//     public int gcd(int a, int b) {
//         if (b == 0) {
//             return a;
//         }

//         return gcd(b, a % b);
//     }

//     public long gcdSum(int[] nums) {

//         int n = nums.length;

//         int[] prefixGcd = new int[n];

//         int mx = Integer.MIN_VALUE;
//         for (int i = 0; i < n; i++) {
//             if(nums[i] > mx)
//             {
//                 mx = nums[i];

//             }

//             prefixGcd[i] = gcd(mx, nums[i]);

//         }
//         Arrays.sort(prefixGcd);

//         int i = 0;
//         int j = n - 1;
//         long sum = 0;
//         while (i < j) {
//             sum = sum + gcd(prefixGcd[i++], prefixGcd[j--]);

//         }

//         return sum;

//     }
// }

//(2)

class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long gcdSum(int[] nums) {

        int n = nums.length;

        int[] prefixGcd = new int[n];

        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] > mx) {
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