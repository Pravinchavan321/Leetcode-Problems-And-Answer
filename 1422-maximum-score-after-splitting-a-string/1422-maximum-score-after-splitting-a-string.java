class Solution {
    public int maxScore(String s) {

        int n = s.length();

        int[] zeroPrefCount = new int[n + 1];
        int[] onePrefCount = new int[n + 1];
        zeroPrefCount[0] = 0;
        onePrefCount[0] = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                zeroPrefCount[i + 1] = zeroPrefCount[i] + 1;
                onePrefCount[i + 1] = onePrefCount[i];
            } else {
                zeroPrefCount[i + 1] = zeroPrefCount[i];
                onePrefCount[i + 1] = onePrefCount[i] + 1;
            }
        }
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n - 1; i++) {
            max = Math.max(max, zeroPrefCount[i + 1] + (onePrefCount[n] - onePrefCount[i + 1]));

        }

        return max;

    }
}