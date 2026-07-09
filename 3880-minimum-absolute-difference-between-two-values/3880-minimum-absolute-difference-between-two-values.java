
                //(1)

// class Solution {
//     public int minAbsoluteDifference(int[] nums) {

//         int min = Integer.MAX_VALUE;

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums.length; j++) {
//                 if (nums[i] == 1 && nums[j] == 2) {
//                     min = Math.min(Math.abs(i - j), min);
//                 }
//             }
//         }

//         return (min == Integer.MAX_VALUE) ? -1 : min;
//     }
// }

                        //(2)

// class Solution {
//     public int minAbsoluteDifference(int[] nums) {

//         List<Integer> one = new ArrayList<>();
//         List<Integer> two = new ArrayList<>();

//         // Store indices of 1 and 2
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == 1) {
//                 one.add(i);
//             } else if (nums[i] == 2) {
//                 two.add(i);
//             }
//         }

//         int min = Integer.MAX_VALUE;

//         // Compare every index of 1 with every index of 2
//         for (int i = 0; i < one.size(); i++) {
//             for (int j = 0; j < two.size(); j++) {
//                 min = Math.min(min,
//                         Math.abs(one.get(i) - two.get(j)));
//             }
//         }

//         return min == Integer.MAX_VALUE ? -1 : min;
//     }
// }

                    //(3)

class Solution {
    public int minAbsoluteDifference(int[] nums) {

        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();

        // Store indices of 1 and 2
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                one.add(i);
            } else if (nums[i] == 2) {
                two.add(i);
            }
        }

        // If either 1 or 2 is not present
        if (one.isEmpty() || two.isEmpty()) {
            return -1;
        }

        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;

        // Two-pointer approach
        while (i < one.size() && j < two.size()) {

            min = Math.min(min, Math.abs(one.get(i) - two.get(j)));

            if (one.get(i) < two.get(j)) {
                i++;
            } else {
                j++;
            }
        }

        return min;
    }
}