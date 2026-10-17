//(1)

// class Solution {
//     private int digitSum(int x) {
//         int s = 0;
//         while (x > 0) {
//             s += x % 10;
//             x /= 10;
//         }
//         return s;
//     }

//     public int minSwaps(int[] nums) {
//         int n = nums.length;

//         // {value, originalIndex}
//         int[][] arr = new int[n][2];
//         for (int i = 0; i < n; i++) {
//             arr[i][0] = nums[i];
//             arr[i][1] = i;
//         }

//         Arrays.sort(arr, (a, b) -> {
//             int da = digitSum(a[0]);
//             int db = digitSum(b[0]);
//             if (da != db)
//                 return da - db;
//             return a[0] - b[0];
//         });

//         boolean[] visited = new boolean[n];
//         int swaps = 0;

//         for (int i = 0; i < n; i++) {
//             if (visited[i] || arr[i][1] == i)
//                 continue;

//             int j = i;
//             int cycleSize = 0;
//             while (!visited[j]) {
//                 visited[j] = true;
//                 j = arr[j][1];
//                 cycleSize++;
//             }
//             swaps += cycleSize - 1;
//         }

//         return swaps;
//     }
// }

//(2)

class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            int s = 0, x = nums[i];
            while (x > 0) {
                s += x % 10;
                x /= 10;
            }
            a[i][0] = s;
            a[i][1] = nums[i];
            a[i][2] = i;
        }
        Arrays.sort(a, (p, q) -> p[0] != q[0]
                ? Integer.compare(p[0], q[0])
                : Integer.compare(p[1], q[1]));

        boolean[] vis = new boolean[n];
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (vis[i] || a[i][2] == i)
                continue;
            int j = i, len = 0;
            while (!vis[j]) {
                vis[j] = true;
                j = a[j][2];
                len++;
            }
            swaps += len - 1;
        }
        return swaps;
    }
}