
                    //(1)

// class Solution {
//     public List<Integer> majorityElement(int[] nums) {

//         int n = nums.length;
//         Map<Integer, Integer> hashMap = new HashMap<>();
//         List<Integer> list = new ArrayList<>();

//         for (int i = 0; i < n; i++) {
//             hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
//         }

//         for (int num : hashMap.keySet()) {
//             if (hashMap.getOrDefault(num, 0) > (n / 3)) {
//                 list.add(num);
//             }
//         }

//         return list;

//     }
// }

                    //(2)

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        if (count1 > nums.length / 3) {
            ans.add(candidate1);
        }

        if (count2 > nums.length / 3) {
            ans.add(candidate2);
        }

        return ans;
    }
}