class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        double diff = 0.0;
        
        // Process first half
        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') diff += 4.5;
            else diff += (num.charAt(i) - '0');
        }
        
        // Process second half
        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') diff -= 4.5;
            else diff -= (num.charAt(i) - '0');
        }
        
        return diff != 0.0;
    }
}