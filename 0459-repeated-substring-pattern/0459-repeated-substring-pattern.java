class Solution {
    public boolean isSameString(String original, String substring) {
        int n = original.length();

        if (n % substring.length() != 0)
            return false;

        int i = 0;
        StringBuilder sb = new StringBuilder(substring);
        while (i < n) {
            if (original.charAt(i) != sb.charAt(i % substring.length())) {
                return false;
            }
            i++;
        }

        return true;
    }

    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        int j = 0;
        while (j < n / 2) {
            if (isSameString(s, s.substring(0, j + 1))) {
                return true;
            }
            j++;
        }
        return false;
    }
}