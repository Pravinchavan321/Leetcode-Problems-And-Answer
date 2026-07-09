
                    //(1)
// class Solution {
//     public int countElements(int[] nums) {

//         int n = nums.length;
//         Arrays.sort(nums);

//         Map<Integer, Integer> hashMap = new HashMap<>();
//         Map<Integer, Integer> freq = new HashMap<>();

//         if (n < 3) {
//             return 0;
//         }

//         // Frequency of each element
//         for (int no : nums) {
//             freq.put(no, freq.getOrDefault(no, 0) + 1);
//         }

//         // Your logic
//         for (int i = 1; i < n; i++) {

//             if (nums[i] > nums[i - 1]) {
//                 hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
//             }

//             if (nums[n - i - 1] < nums[n - i]) {
//                 hashMap.put(nums[n - i - 1],
//                         hashMap.getOrDefault(nums[n - i - 1], 0) + 1);
//             }
//         }

//         int count = 0;

//         for (int no : hashMap.keySet()) {
//             if (hashMap.get(no) == 2) {
//                 count += freq.get(no);
//             }
//         }

//         return count;
//     }
// }

                    //(2)

class Solution {
    public int countElements(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find minimum and maximum
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int count = 0;

        // Count elements between min and max
        for (int num : nums) {
            if (num > min && num < max) {
                count++;
            }
        }

        return count;
    }
}