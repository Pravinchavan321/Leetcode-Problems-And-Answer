class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] freqArr = new int[128];

        int n = s.length();
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while (right < n) {

            int index = s.charAt(right);

            if (freqArr[index] != 0) {
                freqArr[s.charAt(left)]--;
                left++;
            } else {
                freqArr[index]++;
                right++;
                maxLen = Math.max(maxLen, right - left);
            }
        }

        return maxLen;
    }
}