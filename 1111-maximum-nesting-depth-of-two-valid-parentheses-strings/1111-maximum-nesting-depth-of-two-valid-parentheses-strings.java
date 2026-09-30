//(1)
class Solution {
    public int[] maxDepthAfterSplit(String s) {
        int n = s.length();
        int[] res = new int[n];

        for (int i = 0; i < n; i++)
            res[i] = (i ^ s.charAt(i)) & 1;

        return res;
    }
}

//(2) This is the answer for different question

// class Solution {
//     public int[] maxDepthAfterSplit(String s) {
//         int sLen = s.length();
//         int count = 0;
//         int[] resArr = new int[sLen];
//         for (int i = 0; i < sLen; i++) {
//             if (s.charAt(i) == '(') {
//                 count++;
//                 if (count > 1) {
//                     resArr[i] = 1;

//                 } else {
//                     resArr[i] = 0;
//                 }

//             } else {
//                 if (count > 1) {
//                     resArr[i] = 1;

//                 } else {
//                     resArr[i] = 0;
//                 }
//                 count--;

//             }
//         }

//         return resArr;
//     }
// }