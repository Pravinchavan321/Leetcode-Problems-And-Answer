class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;

        if (n < 3) {
            return false;
        }
        boolean ans = false;
        boolean bool = true;
        int maxIndex = 0;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }

        }
        if (maxIndex == n - 1 || maxIndex == 0) {
            return false;
        }
        for (int i = 1; i < n; i++) {
            if ((arr[i] > arr[i - 1] && bool == true)) {
                ans = true;

            } else if (arr[i] < arr[i - 1] && bool == true) {
                bool = false;
            } else if ((arr[i] < arr[i - 1] && bool == false)) {
                ans = true;
            } else {
                return false;
            }

        }

        return ans;

    }
}