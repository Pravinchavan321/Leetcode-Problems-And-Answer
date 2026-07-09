
                        //(1)

// class Solution {
//     public int numDifferentIntegers(String word) {

//         StringBuilder sb = new StringBuilder(word);

//         int n = sb.length();

//         for (int i = 0; i < n; i++) {
//             if (Character.isLetter(sb.charAt(i))) {
//                 sb.setCharAt(i, ' ');
//             }
//         }

//         String[] arr = sb.toString().split("\\s+");

//         HashSet<String> set = new HashSet<>();

//         for (String s : arr) {

//             if (s.length() == 0)
//                 continue;

//             // remove leading zeros
//             int i = 0;
//             while (i < s.length() && s.charAt(i) == '0') {
//                 i++;
//             }

//             if (i == s.length())
//                 set.add("0");
//             else
//                 set.add(s.substring(i));
//         }

//         return set.size();
//     }
// }

                    //(2)

class Solution {
    public int numDifferentIntegers(String word) {

        HashSet<String> set = new HashSet<>();

        int i = 0;
        int n = word.length();

        while (i < n) {

            if (!Character.isDigit(word.charAt(i))) {
                i++;
                continue;
            }

            while (i < n && word.charAt(i) == '0')
                i++;

            int start = i;

            while (i < n && Character.isDigit(word.charAt(i)))
                i++;

            String num = word.substring(start, i);

            if (num.length() == 0)
                num = "0";

            set.add(num);
        }

        return set.size();
    }
}