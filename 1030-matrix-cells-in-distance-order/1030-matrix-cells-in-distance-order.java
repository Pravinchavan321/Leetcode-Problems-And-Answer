//(1)
// class Solution {
//     public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {

//         PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[2] - b[2]);

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 int diffR = Math.abs(i - rCenter);
//                 int diffC = Math.abs(j - cCenter);
//                 minHeap.offer(new int[] { i, j, diffR + diffC });

//             }
//         }

//         int[][] res = new int[rows * cols][2];

//         for (int i = 0; i < rows * cols; i++) {
//             int[] arr = minHeap.poll();
//             res[i] = new int[] { arr[0], arr[1] };
//         }
//         return res;

//     }
// }

//(2)

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        // 1. Determine the maximum possible distance to size our buckets array
        int maxDist = rows + cols - 2;

        // 2. Create buckets where the array index equals the Manhattan distance
        List<int[]>[] buckets = new List[maxDist + 1];
        for (int i = 0; i <= maxDist; i++) {
            buckets[i] = new ArrayList<>();
        }

        // 3. Iterate through the grid, calculate distance, and drop the cell into the correct bucket
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int dist = Math.abs(i - rCenter) + Math.abs(j - cCenter);
                buckets[dist].add(new int[] { i, j });
            }
        }

        // 4. Flatten the buckets into the final result array
        int[][] res = new int[rows * cols][2];
        int index = 0;

        for (int i = 0; i <= maxDist; i++) {
            for (int[] cell : buckets[i]) {
                res[index++] = cell;
            }
        }

        return res;
    }
}