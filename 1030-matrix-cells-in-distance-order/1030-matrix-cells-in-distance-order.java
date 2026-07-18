class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[2] - b[2]);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int diffR = Math.abs(i - rCenter);
                int diffC = Math.abs(j - cCenter);
                minHeap.offer(new int[] { i, j, diffR + diffC });

            }
        }

        int[][] res = new int[rows * cols][2];

        for (int i = 0; i < rows * cols; i++) {
            int[] arr = minHeap.poll();
            res[i] = new int[] { arr[0], arr[1] };
        }
        return res;

    }
}