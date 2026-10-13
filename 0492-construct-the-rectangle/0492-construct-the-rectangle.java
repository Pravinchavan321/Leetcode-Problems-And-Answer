class Solution {
    public int[] constructRectangle(int area) {
        int[] resArr = new int[2];
        int W = 1;
        int L = area;
        int diff = Integer.MAX_VALUE;

        while (W <= L) {
            long prod = (long) L * W; // overflow se safe

            if (prod == area) {
                if (L - W < diff) {
                    resArr[0] = L;
                    resArr[1] = W;
                    diff = L - W;
                }
                L--;
                W++;
            } else if (prod > area) {
                L--;
            } else {
                W++;
            }
        }
        return resArr;
    }
}