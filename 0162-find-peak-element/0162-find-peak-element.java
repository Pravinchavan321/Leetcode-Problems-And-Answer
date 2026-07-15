                    //(1)

// class Solution {
//     public int findPeakElement(int[] nums) {

//         int n = nums.length;

//         if (n == 1) {
//             return 0;
//         }
//         int left = 0;
//         int right = n - 1;
//         int index = -1;
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             if (mid == 0 && nums[mid] > nums[mid + 1]) {
//                 index = mid;
//                 break;

//             } else if (mid == n - 1 && nums[mid] > nums[mid - 1]) {
//                 index = mid;
//                 break;

//             } else if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
//                 index = mid;
//                 break;
//             } else if (nums[mid] < nums[mid + 1]) {
//                 left = mid + 1;
//             } else if (nums[mid] < nums[mid - 1]) {
//                 right = mid - 1;

//             }

//         }

//         return index;

//     }
// }



            //(2)

class Solution {
    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
