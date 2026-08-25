//(1)
// class Solution {
//     public int missingMultiple(int[] nums, int k) {

//         int n = nums.length;
//         Set<Integer> hashSet = new HashSet<>();

//         for (int i : nums) {
//             hashSet.add(i);
//         }

//         int i = 1;
//         while (hashSet.contains(i * k)) {
//             i++;

//         }

//         return (i * k);
//     }
// }

//(2)
class Solution {
    public int missingMultiple(int[] nums, int k) {

        int n = nums.length;
        int[] arr = new int[101];

        for (int i : nums) {
            arr[i - 1] = 1;
            ;
        }

        int i = 1;
        while (true) {

            if (((k * i)) > arr.length || arr[(k * i) - 1] == 0) {
                break;

            }
            i++;

        }

        return (i * k);
    }
}