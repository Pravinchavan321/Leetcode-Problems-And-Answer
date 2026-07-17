import java.util.*;

class Solution {
    public int numMatchingSubseq(String s, String[] words) {

        List<Integer>[] index = new ArrayList[26];

        for (int i = 0; i < 26; i++) {
            index[i] = new ArrayList<>();
        }

        // Store indices of each character
        for (int i = 0; i < s.length(); i++) {
            index[s.charAt(i) - 'a'].add(i);
        }

        int count = 0;

        for (String word : words) {

            int prev = -1;
            boolean found = true;

            for (char ch : word.toCharArray()) {

                List<Integer> list = index[ch - 'a'];

                int pos = upperBound(list, prev);

                if (pos == list.size()) {
                    found = false;
                    break;
                }

                prev = list.get(pos);
            }

            if (found)
                count++;
        }

        return count;
    }

    // First index whose value > target
    private int upperBound(List<Integer> list, int target) {

        int low = 0;
        int high = list.size() - 1;
        int ans = list.size();

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (list.get(mid) > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}