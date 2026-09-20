class Solution {
    public int reverseDegree(String s) {

        int n = s.length();
        int sum = 0;
        int[] arr = new int[26];
        int arrLength = arr.length;
        int last = 26;
        for (int i = 0; i < arrLength; i++) {

            arr[i] = last--;

        }
        for (int i = 0; i < n; i++) {
            sum = sum + (arr[s.charAt(i) - 'a'] * (i + 1));
        }

        return sum;

    }
}