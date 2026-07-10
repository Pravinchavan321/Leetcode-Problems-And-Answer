class Solution {
    public void duplicateZeros(int[] arr) {

        int n = arr.length;
        int[] res = new int[n + 1];

        int i = 0;
        int j = 0;

        while (j < n && i < n) {
            if (arr[i] == 0) {
                res[j] = arr[i];

                res[j + 1] = arr[i];
                j = j + 2;
                i++;

            } else {
                res[j] = arr[i];
                i++;
                j++;

            }

        }

        for (int index = 0; index < n; index++) {
            arr[index] = res[index];
        }

    }
}