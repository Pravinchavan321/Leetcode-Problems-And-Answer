class Solution {
    public int vowelConsonantScore(String s) {

        char[] sArr = s.toCharArray();

        int n = sArr.length;
        int v = 0;
        int c = 0;

        for (int i = 0; i < n; i++) {
            char l = sArr[i];
            if (Character.isLetter(l)) {
                if ("aeiou".indexOf(l) != -1) {
                    v++;

                } else {
                    c++;
                }
            }
        }

        if (c > 0) {
            return (v / c);
        }

        return 0;

    }
}