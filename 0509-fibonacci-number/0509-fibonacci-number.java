
//(1)

// class Solution {
//     public int fib(int n) {
//         if (n == 0) {
//             return 0;

//         }
//         if (n == 1) {
//             return 1;
//         }

//         return fib(n - 1) + fib(n - 2);

//     }
// }

class Solution {
    public int fib(int n) {

        int secondLast = 0;
        int firstLast = 1;

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int i = 2;
        while (i <= n) {
            int temp = secondLast;
            secondLast = firstLast;
            firstLast = firstLast + temp;
            i++;
        }

        return firstLast;

    }
}