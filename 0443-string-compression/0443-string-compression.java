class Solution {
    public int compress(char[] chars) {

        int n = chars.length;
        int index = 0;
        int count = 1;
        char lastChar = chars[0];
        char currChar = lastChar;

        chars[index++] = lastChar;

        for (int i = 1; i < n; i++) {
            currChar = chars[i];
            if (currChar == lastChar) {
                count++;
            } else {
                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[index++] = c;
                    }
                }
                lastChar = currChar;
                chars[index++] = lastChar;
                count = 1;
            }
        }

        if (count > 1) {
            for (char c : String.valueOf(count).toCharArray()) {
                chars[index++] = c;
            }
        }

        return index;
    }
}