//(1)
// class Solution {
//     public int[] decrypt(int[] code, int k) {

//         int n = code.length;
//         int[] res = new int[n];
//         if (k == 0) {
//             return res;
//         }

//         if (k > 0) {
//             for (int i = 0; i < n; i++) {
//                 int count = k;
//                 int sum = 0;
//                 for (int j = (i + 1) % n; count != 0; j = (j + 1) % n) {
//                     count--;
//                     sum += code[j];

//                 }
//                 res[i] = sum;
//             }

//         } else {

//             for (int i = 0; i < n; i++) {
//                 int count = Math.abs(k);
//                 int sum = 0;
//                 for (int j = ((i - 1) % n) < 0 ? n - 1 : ((i - 1) % n); count != 0; j = ((j - 1) % n) < 0 ? n - 1
//                         : (j - 1) % n) {
//                     count--;
//                     sum += code[j];

//                 }
//                 res[i] = sum;
//             }
//         }

//         return res;

//     }
// }


//(2)

class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            return result;
        }

        int windowSum = 0;
        int start, end;

        if (k > 0) {

            start = 1;
            end = k;

            for (int i = start; i <= end; i++) {
                windowSum += code[i % n];
            }

            for (int i = 0; i < n; i++) {
                result[i] = windowSum;

                windowSum -= code[start % n];
                start++;
                end++;
                windowSum += code[end % n];
            }

        } else {

            k = -k;

            start = n - k;
            end = n - 1;

            for (int i = start; i <= end; i++) {
                windowSum += code[i];
            }

            for (int i = 0; i < n; i++) {
                result[i] = windowSum;

                windowSum -= code[start];
                start = (start + 1) % n;
                end = (end + 1) % n;
                windowSum += code[end];
            }
        }

        return result;
    }
}