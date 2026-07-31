//(1)
// class Solution {
//     public int minimumPushes(String word) {

//         int pushes = 0;

//         int n = word.length();
 
//         Integer[] freqArr = new Integer[26];
//         Arrays.fill(freqArr, 0);
//         for (int i = 0; i < n; i++) {
//             freqArr[word.charAt(i) - 'a']++;
//         }

//         Arrays.sort(freqArr, Collections.reverseOrder());

//         int count = 0;
//         for (int i = 0; i < 26; i++) {
//             if (freqArr[i] == 0) {
//                 continue;
//             }
//             if (count < 8) {
//                 count++;
//                 pushes += freqArr[i];

//             } else if (count >= 8 && count < 16) {
//                 count++;
//                 pushes += 2 * freqArr[i];

//             } else if (count >= 16 && count < 24) {
//                 count++;
//                 pushes += 3 * freqArr[i];

//             } else {
//                 count++;
//                 pushes += 4 * freqArr[i];

//             }
//         }

//         return pushes;

//     }
// }



//(2)
class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        Arrays.sort(freq);  // ascending

        int pushes = 0;
        int count = 0;

        // reverse iterate karo (highest freq pehle)
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) break;
            pushes += freq[i] * (count / 8 + 1);
            count++;
        }

        return pushes;
    }
}