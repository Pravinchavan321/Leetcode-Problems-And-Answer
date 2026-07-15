
                //(1)

// class Solution {

//     public int gcd(int a, int b) {
//         if (b == 0) {
//             return a;
//         }
//         return gcd(b, a % b);
//     }

//     public int gcdOfOddEvenSums(int n) {

//         int evenSum = 0;
//         int oddSum = 0;

//         for (int i = 1; i <= (2 * n); i = i + 2) {
//             oddSum = oddSum + i;
//             evenSum = evenSum + (i + 1);

//         }

//         return gcd(oddSum, evenSum);

//     }
// }

                    //(2)

// class Solution {

//     public int gcd(int a, int b) {
//         if (b == 0) {
//             return a;
//         }
//         return gcd(b, a % b);
//     }

//     public int gcdOfOddEvenSums(int n) {

//         // int evenN = n * 2;
//         // int oddN = (n * 2) - 1;
//         // float evenSum = ((n / 2.0f) * (2 + evenN));
//         // float oddSum = ((n / 2.0f) * (1 + oddN));

//         float evenSum = (n / 2.0f) * ((2 * 2) + ((n - 1) * 2));
//         float oddSum = (n / 2.0f) * ((2 * 1) + ((n - 1) * 2));

//         return gcd((int) oddSum, (int) evenSum);

//     }
// }


                    //(3)
class Solution {
    public int gcdOfOddEvenSums(int n) {
        return n;
       
    }
}