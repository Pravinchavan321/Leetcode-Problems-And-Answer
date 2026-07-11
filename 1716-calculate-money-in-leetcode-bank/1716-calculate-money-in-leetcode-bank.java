
                    //(1)


// class Solution {
//     public int totalMoney(int n) {

//         int sum = 0;
//         int remain = n;
//         int tillElemSum = (n < 7) ? n : 7;
//         int count = 0;

//         while (remain > 0) {

//             int days = Math.min(remain, 7);

//             sum = sum + days * (2 * (count + 1) + (days - 1)) / 2;

//             remain = remain - 7;
//             count++;

//         }

//         return sum;
//     }
// }



                        //(2)


class Solution {
    public int totalMoney(int n) {

        int weeks = n / 7;
        int days = n % 7;

        // AP: 28, 35, 42, 49...
        int completeWeeks =
                weeks * (2 * 28 + (weeks - 1) * 7) / 2;

        // AP: (weeks+1), (weeks+2), ...
        int remainingDays =
                days * (2 * (weeks + 1) + (days - 1)) / 2;

        return completeWeeks + remainingDays;
    }
}