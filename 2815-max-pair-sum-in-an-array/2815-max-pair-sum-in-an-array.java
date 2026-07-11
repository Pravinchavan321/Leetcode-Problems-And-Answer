                    //(1)

// class Solution {
//     public int maxSum(int[] nums) {

//         List<List<Integer>> list = new ArrayList<>();
//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             int max = Integer.MIN_VALUE;
//             int no = nums[i];
//             while (no > 0) {
//                 int digit = no % 10;
//                 max = Math.max(max, digit);
//                 no = no / 10;
//             }
//             list.add(Arrays.asList(nums[i], max));

//         }

//         list.sort((a, b) -> {
//             if (b.get(1) == a.get(1)) {
//                 return b.get(0) - a.get(0);

//             }

//             return b.get(1) - a.get(1);
//         });

//         int maxPairSum = -1;

//         int i = 0;
//         int lSize = list.size();
//         while (i < lSize - 1) {
//             if (list.get(i).get(1) == list.get(i + 1).get(1)) {
//                 maxPairSum = Math.max(maxPairSum, list.get(i).get(0) + list.get(i + 1).get(0));

//             }
//             i++;
//         }

//         return maxPairSum;

//     }
// }

                    //(2)

class Solution {
    public int maxSum(int[] nums) {

        int[] best = new int[10];
        Arrays.fill(best, -1);

        int ans = -1;

        for (int num : nums) {

            int maxDigit = 0;
            int temp = num;

            while (temp > 0) {
                maxDigit = Math.max(maxDigit, temp % 10);
                temp /= 10;
            }

            if (best[maxDigit] != -1) {
                ans = Math.max(ans, best[maxDigit] + num);
            }

            best[maxDigit] = Math.max(best[maxDigit], num);
        }

        return ans;
    }
}