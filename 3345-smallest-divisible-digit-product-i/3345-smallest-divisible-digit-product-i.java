class Solution {
    public int smallestNumber(int n, int t) {

        int currNum = n;
        // int res = n;
        while (true) {
            int currNumCopy = currNum;
            int product = 1;
            while (currNum > 0) {
                int digit = currNum % 10;
                product *= digit;
                currNum /= 10;

            }
            if (product % t == 0) {
                // res = currNumCopy;
                // break;

                return currNumCopy;

            }
            currNum = currNumCopy + 1;

        }

        // return res;

    }
}