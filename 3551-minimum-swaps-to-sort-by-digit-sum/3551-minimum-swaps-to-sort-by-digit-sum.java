import java.util.*;

class Solution {
    private int digitSum(int x) {
        int s = 0;
        while (x > 0) {
            s += x % 10;
            x /= 10;
        }
        return s;
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;

        // {value, originalIndex}
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> {
            int da = digitSum(a[0]);
            int db = digitSum(b[0]);
            if (da != db)
                return da - db;
            return a[0] - b[0];
        });

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i][1] == i)
                continue;

            int j = i;
            int cycleSize = 0;
            while (!visited[j]) {
                visited[j] = true;
                j = arr[j][1];
                cycleSize++;
            }
            swaps += cycleSize - 1;
        }

        return swaps;
    }
}