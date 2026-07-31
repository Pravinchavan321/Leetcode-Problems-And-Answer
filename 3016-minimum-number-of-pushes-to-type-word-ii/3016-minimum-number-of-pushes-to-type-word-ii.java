class Solution {
    public int minimumPushes(String word) {

        int pushes = 0;

        int n = word.length();

        Integer[] freqArr = new Integer[26];
        Arrays.fill(freqArr, 0);
        for (int i = 0; i < n; i++) {
            freqArr[word.charAt(i) - 'a']++;
        }

        Arrays.sort(freqArr, Collections.reverseOrder());

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freqArr[i] == 0) {
                continue;
            }
            if (count < 8) {
                count++;
                pushes += freqArr[i];

            } else if (count >= 8 && count < 16) {
                count++;
                pushes += 2 * freqArr[i];

            } else if (count >= 16 && count < 24) {
                count++;
                pushes += 3 * freqArr[i];

            } else {
                count++;
                pushes += 4 * freqArr[i];

            }
        }

        return pushes;

    }
}

// class Solution {
//     public int minimumPushes(String word) {

//         int pushes = 0;

//         int n = word.length();

//         int[] freqArr = new int[26];
//         for (int i = 0; i < n; i++) {
//             freqArr[word.charAt(i) - 'a']++;
//         }

//         int count = 0;
//         for (int i = 0; i < 26; i++) {
//             if (freqArr[i] == 0) {
//                 continue;
//             }
//             if (count <= 8) {
//                 count++;
//                 pushes += freqArr[i];

//             } else if (count > 8 && count <= 16) {
//                 count++;
//                 pushes += 2 * freqArr[i];

//             } else if (count > 16 && count <= 24) {
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