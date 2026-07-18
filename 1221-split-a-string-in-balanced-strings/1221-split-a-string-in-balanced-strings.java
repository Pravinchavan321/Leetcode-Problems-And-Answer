class Solution {
    public int balancedStringSplit(String s) {

        int n = s.length();

        int countR = 0;
        int countL = 0;
        int splitCount = 0;

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == 'R') {
                countR++;

            } else {
                countL++;

            }
            if (countR == countL && countR != 0 && countL != 0) {
                splitCount++;
                countR = 0;
                countL = 0;

            }
        }

        return splitCount;

    }
}