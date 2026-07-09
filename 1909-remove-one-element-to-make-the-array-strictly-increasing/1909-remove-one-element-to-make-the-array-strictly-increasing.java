                                //(1)
// class Solution {
//     public boolean canBeIncreasing(int[] nums) {
//         int n = nums.length;
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             int prev = 0;
//             boolean bool = false;

//             for (int j = 0; j < n; j++) {
//                 if (i == j && i == 0) {
//                     prev = 0;

//                 } else if (i == j) {
//                     prev = nums[i - 1];
//                 } else if (i != j && nums[j] > prev) {
//                     prev = nums[j];
//                     bool = true;

//                 } else {
//                     bool = false;
//                     break;

//                 }

//             }

//             if (bool) {
//                 return true;

//             }

//         }

//         return false;

//     }
// }

                    //(2)

class Solution {
    public boolean canBeIncreasing(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] >= nums[i + 1]) {

                count++;

                if (count > 1) {
                    return false;
                }

                // Decide which element to "remove"
                if (i > 0 && nums[i - 1] >= nums[i + 1]) {
                    // Remove nums[i + 1]
                    nums[i + 1] = nums[i];
                }
                // Else remove nums[i]
                // No assignment is needed because future comparisons
                // naturally skip over nums[i].
            }
        }

        return true;
    }
}