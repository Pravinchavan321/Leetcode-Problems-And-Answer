class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String numStr = String.valueOf(i);
            if (numStr.indexOf("3") == -1 &&
                    numStr.indexOf("4") == -1 &&
                    numStr.indexOf("7") == -1 &&
                    (numStr.indexOf("2") != -1 ||
                            numStr.indexOf("5") != -1 ||
                            numStr.indexOf("6") != -1 ||
                            numStr.indexOf("9") != -1)) {

                count++;
            }

        }

        return count;

    }
}