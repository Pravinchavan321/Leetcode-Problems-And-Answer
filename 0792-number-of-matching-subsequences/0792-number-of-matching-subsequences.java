//(1)

// class Solution {
//     public int numMatchingSubseq(String s, String[] words) {

//         List<Integer>[] index = new ArrayList[26];

//         for (int i = 0; i < 26; i++) {
//             index[i] = new ArrayList<>();
//         }

//         // Store indices of each character
//         for (int i = 0; i < s.length(); i++) {
//             index[s.charAt(i) - 'a'].add(i);
//         }

//         int count = 0;

//         for (String word : words) {

//             int prev = -1;
//             boolean found = true;

//             for (char ch : word.toCharArray()) {

//                 List<Integer> list = index[ch - 'a'];

//                 int pos = upperBound(list, prev);

//                 if (pos == list.size()) {
//                     found = false;
//                     break;
//                 }

//                 prev = list.get(pos);
//             }

//             if (found)
//                 count++;
//         }

//         return count;
//     }

//     // First index whose value > target
//     private int upperBound(List<Integer> list, int target) {

//         int low = 0;
//         int high = list.size() - 1;
//         int ans = list.size();

//         while (low <= high) {

//             int mid = low + (high - low) / 2;

//             if (list.get(mid) > target) {
//                 ans = mid;
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }

//         return ans;
//     }
// }

//(2)

import java.util.*;

class Solution {

    class Node {
        String word;
        int index;

        Node(String word, int index) {
            this.word = word;
            this.index = index;
        }
    }

    public int numMatchingSubseq(String s, String[] words) {

        List<Node>[] buckets = new ArrayList[26];

        for (int i = 0; i < 26; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Put every word into the bucket of its first character
        for (String word : words) {
            buckets[word.charAt(0) - 'a'].add(new Node(word, 0));
        }

        int count = 0;

        for (char ch : s.toCharArray()) {

            List<Node> current = buckets[ch - 'a'];

            // Create a new empty bucket for this character
            buckets[ch - 'a'] = new ArrayList<>();

            for (Node node : current) {

                node.index++;

                if (node.index == node.word.length()) {
                    count++;
                } else {

                    char next = node.word.charAt(node.index);

                    buckets[next - 'a'].add(node);
                }
            }
        }

        return count;
    }
}