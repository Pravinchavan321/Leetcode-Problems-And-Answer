//(1)

// class Solution {
//     public String removeDuplicates(String s) {

//         StringBuilder sb = new StringBuilder();

//         sb.append(s.charAt(0));
//         int i = 0;
//         int j = 1;
//         int n = s.length();

//         while (j < n) {
//             if (sb.length() != 0 && sb.charAt(i) == s.charAt(j)) {
//                 sb.deleteCharAt(sb.length() - 1);

//                 i--;
//                 j++;
//             } else if (sb.length() == 0) {
//                 sb.append(s.charAt(j));
//                 i = 0;
//                 j++;
//             } else {
//                 sb.append(s.charAt(j));
//                 i++;
//                 j++;
//             }

//         }

//         return sb.toString();

//     }
// }

//(2)

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            int len = sb.length();

            // If the StringBuilder isn't empty and the last char matches the current char
            if (len > 0 && sb.charAt(len - 1) == c) {
                sb.deleteCharAt(len - 1); // "Pop" the duplicate
            } else {
                sb.append(c); // "Push" the new character
            }
        }

        return sb.toString();
    }
}