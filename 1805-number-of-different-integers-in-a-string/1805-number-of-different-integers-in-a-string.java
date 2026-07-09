class Solution {
    public int numDifferentIntegers(String word) {

        StringBuilder sb = new StringBuilder(word);

        int n = sb.length();

        for (int i = 0; i < n; i++) {
            if (Character.isLetter(sb.charAt(i))) {
                sb.setCharAt(i, ' ');
            }
        }

        String[] arr = sb.toString().split("\\s+");

        HashSet<String> set = new HashSet<>();

        for (String s : arr) {

            if (s.length() == 0)
                continue;

            // remove leading zeros
            int i = 0;
            while (i < s.length() && s.charAt(i) == '0') {
                i++;
            }

            if (i == s.length())
                set.add("0");
            else
                set.add(s.substring(i));
        }

        return set.size();
    }
}