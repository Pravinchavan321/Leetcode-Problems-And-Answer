
//(1)

class Solution {
    public int sumCounts(List<Integer> nums) {

        int[] arr = new int[101];
        int n = nums.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                arr[nums.get(j)]++;
                int count = 0;
                for (int index = 0; index < arr.length; index++) {
                    if (arr[index] > 0) {

                        count++;
                    }
                }
                sum += count * count;
            }
            Arrays.fill(arr, 0);

        }

        return sum;

    }
}

//(2)

// class Solution {
//     public int sumCounts(int[] nums) {
//         int totalSum = 0;
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             Set<Integer> seen = new HashSet<>();
//             for (int j = i; j < n; j++) {
//                 seen.add(nums[j]);
//                 int distinctCount = seen.size();
//                 totalSum += distinctCount * distinctCount;
//             }
//         }

//         return totalSum;
//     }
// }