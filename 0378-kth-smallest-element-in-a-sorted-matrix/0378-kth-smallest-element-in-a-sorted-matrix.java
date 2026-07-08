
//(1)

// class Solution {
//     public int kthSmallest(int[][] matrix, int k) {

//         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

//         int n = matrix.length;
//         int count = 0;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 int elem = matrix[i][j];
//                 if (count < k) {
//                     maxHeap.offer(elem);
//                     count++;

//                 } else if (!maxHeap.isEmpty()) {

//                     if (elem <= maxHeap.peek()) {
//                         maxHeap.poll();
//                         maxHeap.offer(elem);

//                     }

//                 }

//             }
//         }

//         return maxHeap.poll();

//     }
// }

//(2)

// class Solution {
//     public int kthSmallest(int[][] matrix, int k) {

//         int n = matrix.length;

//         PriorityQueue<int[]> minHeap = new PriorityQueue<>(
//                 (a, b) -> a[0] - b[0]);

//         for (int i = 0; i < n; i++) {
//             minHeap.offer(new int[] { matrix[i][0], i, 0 });
//         }

//         while (k > 1) {

//             int[] curr = minHeap.poll();

//             int value = curr[0];
//             int row = curr[1];
//             int col = curr[2];

//             if (col + 1 < n) {
//                 minHeap.offer(new int[] {
//                         matrix[row][col + 1],
//                         row,
//                         col + 1
//                 });
//             }

//             k--;
//         }

//         return minHeap.peek()[0];
//     }
// }

//(3)

class Solution {

    public int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;

        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low < high) {

            int mid = low + (high - low) / 2;

            int count = countLessOrEqual(matrix, mid);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private int countLessOrEqual(int[][] matrix, int target) {

        int n = matrix.length;

        int row = n - 1;
        int col = 0;

        int count = 0;

        while (row >= 0 && col < n) {

            if (matrix[row][col] <= target) {

                count += row + 1;
                col++;

            } else {

                row--;
            }
        }

        return count;
    }
}