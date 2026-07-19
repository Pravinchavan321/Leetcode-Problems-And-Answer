//(1)

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}

//(2)

// class Solution {
//     public int[] createTargetArray(int[] nums, int[] index) {

//         int n = index.length;
//         int[] res = new int[n];
//         for (int i = 0; i < n; i++) {
//             for (int j = n - 2; j >= index[i]; j--) {
//                 res[j + 1] = res[j];

//             }
//             res[index[i]] = nums[i];

//         }

//         return res;

//     }
// }