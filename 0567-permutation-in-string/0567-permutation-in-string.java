class Solution {

    public boolean isSameArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < n1; i++) {
            freq1[s1.charAt(i) - 'a'] += 1;
        }
        int left = 0;
        int right = 0;

        for (int i = 0; i < n1; i++) {
            freq2[s2.charAt(i) - 'a'] += 1;

        }
        left = 0;
        right = n1 - 1;

        while (right < n2) {
            if (isSameArray(freq1, freq2)) {
                return true;

            } else {
                freq2[s2.charAt(left) - 'a'] -= 1;
                left++;
                right++;
                if(right == n2)
                {
                    return false;
                }
                freq2[s2.charAt(right) - 'a'] += 1;
            
            }

        }
        return false;


    }
}