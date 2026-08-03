//(1)
// class Solution {
//     public void rotate(int[] nums, int k) {

//         int n = nums.length;
//         int[] res = new int[n];

//         for (int i = 0; i < n; i++) {
//             res[(i + k) % n] = nums[i];
//         }
//         for (int i = 0; i < n; i++) {
//             nums[i] = res[i];
//         }

//     }
// }

//(2)

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // handle k >= n

        // Step 1: reverse the whole array
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }

        // Step 2: reverse the first k elements
        for (int i = 0; i < k / 2; i++) {
            temp = nums[i];
            nums[i] = nums[k - i - 1];
            nums[k - i - 1] = temp;
        }

        // Step 3: reverse the remaining n - k elements
        for (int i = 0; i < (n - k) / 2; i++) {
            temp = nums[k + i];
            nums[k + i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
    }
}