class Solution {
    public int minOperations(String s) {
        int n = s.length();
        
        // Step 1a: Check if already sorted while tracking global min and max
        boolean isSorted = true;
        char mn = s.charAt(0);
        char mx = s.charAt(0);
        
        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            if (c < s.charAt(i - 1)) {
                isSorted = false;
            }
            if (c < mn) mn = c;
            if (c > mx) mx = c;
        }
        
        if (isSorted) return 0;
        
        // Step 1b: Impossible if length is 2 and unsorted
        if (n == 2) return -1;
        
        // Step 2: 1 operation if first char is mn OR last char is mx
        if (s.charAt(0) == mn || s.charAt(n - 1) == mx) {
            return 1;
        }
        
        // Step 3: 2 operations if mn exists in s[0..n-2] OR mx exists in s[1..n-1]
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == mn) return 2;
        }
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == mx) return 2;
        }
        
        // Step 4: Otherwise, mn is uniquely at s[n-1] and mx is uniquely at s[0]
        return 3;
    }
}