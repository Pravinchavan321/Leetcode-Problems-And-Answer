//(1)

// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {

//         List<Integer> list = new ArrayList<>();
//         Arrays.sort(nums);
//         int n = nums.length;
//         int min = nums[0];
//         int max = nums[n - 1];
//         Set<Integer> hashSet = new HashSet<>();

//         for (int i = 0; i < n; i++) {
//             hashSet.add(nums[i]);
//         }

//         for (int i = min; i <= max; i++) {
//             if (!hashSet.contains(i)) {
//                 list.add(i);
//             }
//         }

//         return list;

//     }
// }

//(2)

// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {

//         List<Integer> list = new ArrayList<>();

//         int n = nums.length;
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < n; i++) {
//             if (nums[i] < min) {
//                 min = nums[i];

//             }
//             if (nums[i] > max) {
//                 max = nums[i];
//             }
//         }
//         Set<Integer> hashSet = new HashSet<>();

//         for (int i = 0; i < n; i++) {
//             hashSet.add(nums[i]);
//         }

//         for (int i = min; i <= max; i++) {
//             if (!hashSet.contains(i)) {
//                 list.add(i);
//             }
//         }

//         return list;

//     }
// }

//(3)

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int[] isPresentArr = new int[max + 1];

        for (int i = 0; i < n; i++) {
            isPresentArr[nums[i]] = 1;
        }

        for (int i = min; i <= max; i++) {
            if (isPresentArr[i] == 0) {
                list.add(i);
            }
        }

        return list;

    }
}