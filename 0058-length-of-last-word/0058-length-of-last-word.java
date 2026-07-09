class Solution {
    public int lengthOfLastWord(String s) {

        int count = 0;
        boolean bool = false;
        if (s.indexOf(" ") == -1) {
            return s.length();
        } else if (s.lastIndexOf(" ") < s.length()) {

            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                if (c != ' ') {
                    count++;
                    bool = true;

                } else if (bool == true && c == ' ') {
                    break;

                }
            }

        }

        return count;

    }
}