class Solution {
    public int countCharacters(String[] words, String chars) {

        int[] freqArr = new int[26];
        int n = chars.length();
        for (int i = 0; i < n; i++) {
            freqArr[chars.charAt(i) - 'a']++;
        }

        int[] freqCopy = freqArr.clone();
        int arrSize = words.length;
        int sum = 0;
        for (int i = 0; i < arrSize; i++) {
            String word = words[i];
            int length = word.length();
            boolean bool = true;
            for (int j = 0; j < length; j++) {
                if (!bool) {
                    break;

                }
                if (freqArr[word.charAt(j) - 'a'] != 0) {
                    freqArr[word.charAt(j) - 'a']--;

                } else {
                    bool = false;
                }

            }
            freqArr = freqCopy.clone();
            if (bool) {
                sum = sum + length;

            }

        }

        return sum;

    }
}