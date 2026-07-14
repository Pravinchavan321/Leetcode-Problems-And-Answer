
//(GIVES TLE)

// class Solution {
//     public String removeStars(String s) {

//         int n = s.length();
//         StringBuilder sb = new StringBuilder(s);

//         while (sb.indexOf("*") != -1) {
//             int index = sb.indexOf("*");
//             if (index != 0) {
//                 sb.delete(index - 1, index + 1);

//             } else {
//                 sb.deleteCharAt(0);
//             }

//         }

//         return sb.toString();

//     }
// }

class Solution {
    public String removeStars(String s) {

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int j = n - 1;
        int count = 0;
        while (j >= 0) {
            char c = s.charAt(j);
            if (c == '*') {
                count++;

            } else if (Character.isLetter(c) && count == 0) {
                sb.append(c);
            } else if (Character.isLetter(c) && count != 0) {
                count--;
            }
            j--;

        }

        return sb.reverse().toString();

    }
}
