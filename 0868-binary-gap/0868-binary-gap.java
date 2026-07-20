class Solution {
    public int binaryGap(int n) {

        String bStr = Integer.toBinaryString(n);
        int length = bStr.length();
        boolean lastOne = false;
        int countZero = 0;
        int countOne = 0;
        int i = length - 1;
        int max = 0;
        while (i >= 0) {
            char c = bStr.charAt(i);

            if (c == '1' && lastOne == false) {
                lastOne = true;
                countOne++;

            } else if (c == '0' && lastOne == true) {
                countZero++;

            } else if (c == '1' && lastOne == true) {
                if (countZero > max) {
                    max = countZero;
                }
                countOne++;
                countZero = 0;

            }
            i--;

        }
        if (countOne < 2) {
            return 0;
        }

        return max + 1;

    }
}