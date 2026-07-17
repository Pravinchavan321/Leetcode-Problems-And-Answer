//(1)


// class Solution {
//     public int rotatedDigits(int n) {
//         int count = 0;
//         for (int i = 1; i <= n; i++) {
//             String numStr = String.valueOf(i);
//             if (numStr.indexOf("3") == -1 &&
//                     numStr.indexOf("4") == -1 &&
//                     numStr.indexOf("7") == -1 &&
//                     (numStr.indexOf("2") != -1 ||
//                             numStr.indexOf("5") != -1 ||
//                             numStr.indexOf("6") != -1 ||
//                             numStr.indexOf("9") != -1)) {

//                 count++;
//             }

//         }

//         return count;

//     }
// }



//(2)

class Solution {
    public int rotatedDigits(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (isGood(i)) {
                count++;
            }
        }

        return count;
    }

    private boolean isGood(int num) {

        boolean changed = false;

        while (num > 0) {
            int digit = num % 10;

            if (digit == 3 || digit == 4 || digit == 7) {
                return false;
            }

            if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                changed = true;
            }

            num /= 10;
        }

        return changed;
    }
}