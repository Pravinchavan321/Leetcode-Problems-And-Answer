//(1)

// class Solution {
//     public int findLongestChain(int[][] pairs) {

//         PriorityQueue<int[]> minHeap = new PriorityQueue<>(
//             (a, b) -> a[1] - b[1]
//         );

//         for (int[] pair : pairs) {
//             minHeap.offer(pair);
//         }

//         int chainLen = 0;
//         int lastEnd = Integer.MIN_VALUE;

//         while (!minHeap.isEmpty()) {

//             int[] curr = minHeap.poll();

//             if (curr[0] > lastEnd) {
//                 chainLen++;
//                 lastEnd = curr[1];
//             }
//         }

//         return chainLen;
//     }
// }


//(2)
class Solution {
    public int findLongestChain(int[][] pairs) {

        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);

        int ans = 0;
        int lastEnd = Integer.MIN_VALUE;

        for (int[] pair : pairs) {
            if (pair[0] > lastEnd) {
                ans++;
                lastEnd = pair[1];
            }
        }

        return ans;
    }
}