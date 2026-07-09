class Solution {
    public boolean isFascinating(int n) {
        int oneN = n;

        while (oneN > 0) {
            if (oneN % 10 == 0) {
                return false;
            }
            oneN = oneN / 10;

        }

        if (n % 10 == 5) {
            return false;
        }
        int twoN = n * 2;
        int threeN = n * 3;
        int[] arr = new int[10];

        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.append(String.valueOf(twoN));
        sb.append(String.valueOf(threeN));

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            arr[c - '0'] = arr[c - '0'] + 1;
        }

        for (int i = 1; i < 10; i++) {
            if (arr[i] != 1) {
                return false;
            }
        }

        return true;

    }
}