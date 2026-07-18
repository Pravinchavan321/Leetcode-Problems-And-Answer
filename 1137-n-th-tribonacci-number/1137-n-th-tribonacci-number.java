// class Solution {
//     public int tribonacci(int n) {

//         if (n == 0) {
//             return 0;
//         }
//         if (n == 1 && n == 2) {
//             return 1;
//         }

//         return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);

//     }
// }

class Solution {
    public int tribonacci(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1 && n == 2) {
            return 1;
        }
        int thirdLast = 0;
        int secondLast = 1;
        int firstLast = 1;
        int i = 3;
        while (i <= n) {
            int temp = firstLast;
            firstLast = thirdLast + secondLast + firstLast;
            thirdLast = secondLast;
            secondLast = temp;
            i++;

        }
        return firstLast;

    }
}