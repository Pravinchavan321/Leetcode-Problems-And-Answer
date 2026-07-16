//(((This is for finding the next greater element but smallest in circular array)))

// class Solution {
//     public int[] nextGreaterElements(int[] nums) {

//         TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

//         Map<Integer, Integer> hashMap = new HashMap<>();

//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             treeSet.add(nums[i]);
//         }

//         int nextGreater = -1;
//         for (int num : treeSet) {

//             hashMap.put(num, nextGreater);
//             nextGreater = num;

//         }
//         for (int i = 0; i < n; i++) {
//             nums[i] = hashMap.get(nums[i]);
//         }

//         return nums;

//     }
// }

//(1) Brute Force

// class Solution {
//     public int[] nextGreaterElements(int[] nums) {

//         int n = nums.length;

//         int[] ans = new int[n];

//         for (int i = 0; i < n; i++) {
//             int j = (i + 1) % n;
//             int nextGreater = -1;
//             while (i != j) {
//                 if (nums[j] > nums[i]) {

//                     nextGreater = nums[j];
//                     break;
//                 }
//                 j = (j + 1) % n;

//             }
//             ans[i] = nextGreater;

//         }

//         return ans;

//     }
// }

//(2)

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] a = new int[n];
        for (int i = n * 2 - 1; i >= 0; i--) {
            int ind = i % n;
            while (!st.empty() && st.peek() <= nums[ind]) {
                st.pop();
            }
            if (i < n) {
                a[i] = st.empty() ? -1 : st.peek();
            }
            st.push(nums[ind]);
        }
        return a;

    }
}
