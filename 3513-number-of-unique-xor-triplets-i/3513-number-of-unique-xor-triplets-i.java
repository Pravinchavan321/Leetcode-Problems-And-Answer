//(1)

// class Solution {
//     public int uniqueXorTriplets(int[] nums) {
//         int n = nums.length;

//         if (n <= 2) return n;

//         int mask = 0;
//         for (int num : nums) {
//             mask |= num;
//         }

//         return mask + 1;
//     }
// }

//(2)

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        return 1 << (32 - Integer.numberOfLeadingZeros(n) - 3 / (n + 1));
    }
}