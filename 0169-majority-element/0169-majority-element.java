//(1)

// class Solution {
//     public int majorityElement(int[] nums) {

//         Map<Integer, Integer> hashMap = new HashMap<>();

//         int n = nums.length;
//         int elem = nums[0];

//         for (int i = 0; i < n; i++) {
//             hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);

//             if (hashMap.getOrDefault(nums[i], 0) > (n / 2)) {
//                 elem = nums[i];
//                 break;
//             }

//         }

//         return elem;

//     }
// }

//(2)

// class Solution {
//     public int majorityElement(int[] nums) {

//         Arrays.sort(nums);

//         int n = nums.length;

//         int elem = nums[0];
//         for (int i = 0; i < n; i++) {

//             if (nums[i] == nums[i + (n / 2)]) {
//                 elem = nums[i];
//                 break;
//             }

//         }

//         return elem;

//     }
// }

//(3)

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}