class Solution {
    public int secondHighest(String s) {

        int n = s.length();
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int val = c - '0';
                if (val > max1) {
                    max2 = max1;
                    max1 = val;

                } else if (val > max2 && val != max1) {
                    max2 = val;

                }

            }
        }

        if (max1 == max2 || max2 == Integer.MIN_VALUE) {
            return -1;
        }

        return max2;

    }
}