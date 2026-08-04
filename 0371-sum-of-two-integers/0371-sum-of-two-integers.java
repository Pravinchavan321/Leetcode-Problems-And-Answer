//(1)  This is right but we have not to use any '+' or '-' charcater
// class Solution {
//     public int getSum(int a, int b) {

//         String sa = Integer.toBinaryString(a);
//         String sb = Integer.toBinaryString(b);

//         StringBuilder sba = new StringBuilder(sa);
//         StringBuilder sbb = new StringBuilder(sb);

//         while (sba.length() < sbb.length()) {
//             sba.insert(0, '0');
//         }

//         while (sbb.length() < sba.length()) {
//             sbb.insert(0, '0');
//         }

//         StringBuilder ans = new StringBuilder();

//         int carry = 0;

//         for (int i = sba.length() - 1; i >= 0; i--) {

//             int bit1 = sba.charAt(i) - '0';
//             int bit2 = sbb.charAt(i) - '0';

//             int sum = bit1 + bit2 + carry;

//             ans.append(sum % 2);
//             carry = sum / 2;
//         }

//         if (carry == 1) {
//             ans.append('1');
//         }

//         ans.reverse();

//         return Integer.parseInt(ans.toString(), 2);
//     }
// }

//(2)

class Solution {
    public int getSum(int a, int b) {

        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }

        return a;
    }
}