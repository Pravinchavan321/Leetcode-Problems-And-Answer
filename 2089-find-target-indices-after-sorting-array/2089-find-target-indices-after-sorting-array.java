
//(1)
// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {

//         List<Integer> list = new ArrayList<>();
//         Arrays.sort(nums);
//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             if (nums[i] == target) {
//                 list.add(i);
//             }

//         }

//         return list;

//     }
// }

//(2)

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> list = new ArrayList<>();
        int less = 0;
        int equal = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < target) {
                less++;

            } else if (nums[i] == target) {
                equal++;

            }

        }

        for (int i = less; i < less + equal; i++) {
            list.add(i);
        }

        return list;

    }
}