class Solution {
    public boolean isSameString(String original, String sub) {
        int n = original.length();
        int len = sub.length();

        if (n % len != 0) return false;

        for (int i = 0; i < n; i++) {
            if (original.charAt(i) != sub.charAt(i % len)) {
                return false;
            }
        }
        return true;
    }

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int j = 0; j < n / 2; j++) {
            if (isSameString(s, s.substring(0, j + 1))) {
                return true;
            }
        }
        return false;
    }
}