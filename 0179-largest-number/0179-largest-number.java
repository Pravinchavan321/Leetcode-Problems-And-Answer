//(1)

// class Solution {
//     public String largestNumber(int[] nums) {

//         PriorityQueue<String> maxHeap = new PriorityQueue<>((a, b) -> (b + a).compareTo(a + b));

//         for (int num : nums) {
//             maxHeap.offer(String.valueOf(num));
//         }

//         StringBuilder sb = new StringBuilder();

//         while (!maxHeap.isEmpty()) {
//             sb.append(maxHeap.poll());
//         }

//         if (sb.charAt(0) == '0') {
//             return "0";
//         }

//         return sb.toString();
//     }
// }

//(2)
class Solution {
    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }
}