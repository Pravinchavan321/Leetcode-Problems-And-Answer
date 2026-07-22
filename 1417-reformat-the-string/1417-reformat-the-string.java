//(1)

// class Solution {
//     public String reformat(String s) {

//         int n = s.length();

//         int countLetter = 0;
//         int countDigit = 0;
//         List<Character> listLetter = new ArrayList<>();
//         List<Character> listDigit = new ArrayList<>();

//         for (int i = 0; i < n; i++) {
//             char c = s.charAt(i);
//             if (Character.isLetter(c)) {
//                 countLetter++;
//                 listLetter.add(c);
//             } else {
//                 countDigit++;
//                 listDigit.add(c);
//             }
//         }

//         if ((countLetter == 0 || countDigit == 0) && n > 1) {
//             return "";
//         }

//         StringBuilder sb = new StringBuilder();
//         int iL = 0;
//         int jD = 0;
//         int idx = 0;
//         if (countLetter == countDigit || countLetter - 1 == countDigit || countLetter == countDigit - 1) {
//             if()
//             while (idx < n) {
//                 if (idx % 2 == 0) {
//                     if (countLetter >= countDigit) {

//                         sb.append(listLetter.get(iL++));
//                     } else {
//                         sb.append(listDigit.get(jD++));

//                     }

//                 } else {
//                     if (countLetter < countDigit) {

//                         sb.append(listLetter.get(iL++));
//                     } else {
//                         sb.append(listDigit.get(jD++));

//                     }

//                 }
//                 idx++;
//             }

//         } else {
//             return "";
//         }

//         return sb.toString();

//     }
// }

//(2)

// class Solution {
//     public String reformat(String s) {
//         List<Character> letters = new ArrayList<>();
//         List<Character> digits = new ArrayList<>();

//         for (char c : s.toCharArray()) {
//             if (Character.isLetter(c)) letters.add(c);
//             else digits.add(c);
//         }

//         int lCount = letters.size(), dCount = digits.size();

//         if (Math.abs(lCount - dCount) > 1) return "";

//         StringBuilder sb = new StringBuilder();
//         int iL = 0, iD = 0;

//         // Jo zyada hai wo pehle aayega (even index pe)
//         boolean letterFirst = lCount >= dCount;

//         for (int i = 0; i < s.length(); i++) {
//             if (i % 2 == 0) {
//                 sb.append(letterFirst ? letters.get(iL++) : digits.get(iD++));
//             } else {
//                 sb.append(letterFirst ? digits.get(iD++) : letters.get(iL++));
//             }
//         }

//         return sb.toString();
//     }
// }

//(3)

class Solution {
    public String reformat(String s) {
        int letter = 0;
        int digit = 0;
        // Pehle sirf count karo
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch))
                letter++;
            else
                digit++;
        }
        // Agar difference 1 se zyada hai
        // to alternate banana possible nahi
        if (Math.abs(letter - digit) > 1)
            return "";
        char[] ans = new char[s.length()];
        int letterIdx;
        int digitIdx;
        // Jiski count zyada hai woh index 0 se start karega
        if (letter >= digit) {
            letterIdx = 0;
            digitIdx = 1;
        } else {
            digitIdx = 0;
            letterIdx = 1;
        }
        // Ab characters ko unki position par rakho
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                ans[letterIdx] = c;
                letterIdx += 2;
            } else {
                ans[digitIdx] = c;
                digitIdx += 2;
            }
        }

        return new String(ans);
    }
}