
                        //(1)

// class Solution {
//     public String toGoatLatin(String sentence) {

//         String[] arr = sentence.split("\\s+");

//         int n = arr.length;
//         StringBuilder sRes = new StringBuilder();

//         for (int i = 0; i < n; i++) {

//             StringBuilder sb = new StringBuilder(arr[i]);
//             char c = arr[i].charAt(0);

//             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
//                     c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

//                 sb.append("ma");

//             } else {

//                 sb.deleteCharAt(0);
//                 sb.append(c);
//                 sb.append("ma");
//             }

//             for (int j = 0; j <= i; j++) {
//                 sb.append('a');
//             }

//             sRes.append(sb);

//             if (i != n - 1) {
//                 sRes.append(" ");
//             }
//         }

//         return sRes.toString();
//     }
// }

                        //(2)

class Solution {
    public String toGoatLatin(String sentence) {

        StringBuilder res = new StringBuilder();
        int n = sentence.length();
        int word = 1;
        int i = 0;

        while (i < n) {

            int start = i;
            char first = sentence.charAt(i);

            while (i < n && sentence.charAt(i) != ' ') {
                i++;
            }

            if ("AEIOUaeiou".indexOf(first) != -1) {

                for (int j = start; j < i; j++) {
                    res.append(sentence.charAt(j));
                }

            } else {

                for (int j = start + 1; j < i; j++) {
                    res.append(sentence.charAt(j));
                }

                res.append(first);
            }

            res.append("ma");

            for (int j = 0; j < word; j++) {
                res.append('a');
            }

            word++;

            if (i < n) {
                res.append(' ');
                i++;
            }
        }

        return res.toString();
    }
}