class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] res = new int[n];
        if (k == 0) {
            return res;
        }

        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int count = k;
                int sum = 0;
                for (int j = (i + 1) % n; count != 0; j = (j + 1) % n) {
                    count--;
                    sum += code[j];

                }
                res[i] = sum;
            }

        } else {

            for (int i = 0; i < n; i++) {
                int count = Math.abs(k);
                int sum = 0;
                for (int j = ((i - 1) % n) < 0 ? n - 1 : ((i - 1) % n); count != 0; j = ((j - 1) % n) < 0 ? n - 1
                        : (j - 1) % n) {
                    count--;
                    sum += code[j];

                }
                res[i] = sum;
            }
        }

        return res;

    }
}