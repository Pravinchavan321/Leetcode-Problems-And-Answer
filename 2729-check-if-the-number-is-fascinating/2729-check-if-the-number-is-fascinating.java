//(1)

// class Solution {
//     public boolean isFascinating(int n) {
//         int oneN = n;

//         while (oneN > 0) {
//             if (oneN % 10 == 0) {
//                 return false;
//             }
//             oneN = oneN / 10;

//         }

//         if (n % 10 == 5) {
//             return false;
//         }
//         int twoN = n * 2;
//         int threeN = n * 3;
//         int[] arr = new int[10];

//         StringBuilder sb = new StringBuilder(String.valueOf(n));
//         sb.append(String.valueOf(twoN));
//         sb.append(String.valueOf(threeN));

//         for (int i = 0; i < sb.length(); i++) {
//             char c = sb.charAt(i);
//             arr[c - '0'] = arr[c - '0'] + 1;
//         }

//         for (int i = 1; i < 10; i++) {
//             if (arr[i] != 1) {
//                 return false;
//             }
//         }

//         return true;

//     }
// }

//(2)

class Solution {
    public boolean isFascinating(int n) {

        int[] arr = new int[10];

        if (!countDigits(n, arr))
            return false;
        if (!countDigits(n * 2, arr))
            return false;
        if (!countDigits(n * 3, arr))
            return false;

        for (int i = 1; i <= 9; i++) {
            if (arr[i] != 1) {
                return false;
            }
        }

        return true;
    }

    private boolean countDigits(int num, int[] arr) {
        while (num > 0) {
            int digit = num % 10;

            if (digit == 0 || arr[digit] == 1) {
                return false;
            }

            arr[digit]++;
            num /= 10;
        }

        return true;
    }
}