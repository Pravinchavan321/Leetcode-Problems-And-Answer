class Solution {

    String res;

    public String lexGreaterPermutation(String s, String target) {
        res = "";
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        helper(target, 0, false, counts, new char[s.length()]);
        return res;
    }

    private boolean helper(String target, int index, boolean isGreater, int[] counts, char[] cur) {
        if (index == target.length()) {
            if (isGreater) {
                res = new String(cur);
                return true;
            }
            return false;
        }
        if (isGreater) {
            for (char c = 'a'; c <= 'z'; c++) {
                while (counts[c - 'a'] > 0) {
                    cur[index] = c;
                    index++;
                    counts[c - 'a']--;
                }
            }
            res = new String(cur);
            return true;
        }
        for (char c = target.charAt(index); c <= 'z'; c++) {
            if (counts[c - 'a'] == 0) {
                continue;
            }
            counts[c - 'a']--;
            cur[index] = c;
            if (helper(target, index + 1, c != target.charAt(index), counts, cur)) {
                return true;
            }
            counts[c - 'a']++;
        }
        return false;
    }
}