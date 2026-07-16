//(1)

// class Solution {
//     public void sortColors(int[] nums) {
//         HashMap<Integer, Integer> count = new HashMap<>();
//         count.put(0, 0);
//         count.put(1, 0);
//         count.put(2, 0);

//         for (int num : nums) {
//             count.put(num, count.get(num) + 1);
//         }

//         int idx = 0;
//         for (int color = 0; color < 3; color++) {
//             int freq = count.get(color);
//             for (int j = 0; j < freq; j++) {
//                 nums[idx] = color;
//                 idx++;
//             }
//         }
//     }
// }

//(2)

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;

        for (int num : nums) {
            if (num == 0) {
                countZero++;
            } else if (num == 1) {
                countOne++;

            } else {
                countTwo++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (countZero != 0) {
                nums[i] = 0;
                countZero--;
            } else if (countOne != 0) {
                nums[i] = 1;
                countOne--;
            } else {
                nums[i] = 2;
                countTwo--;
            }

        }

    }
}