class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        int xleftCommonArea = Math.max(ax1, bx1);
        int xRightCommonArea = Math.min(ax2, bx2);
        int ybottomCommonArea = Math.max(ay1, by1);
        int ytopCommonArea = Math.min(ay2, by2);

        int aRecArea = Math.abs(ax2 - ax1) * Math.abs(ay2 - ay1);
        int bRecArea = Math.abs(bx2 - bx1) * Math.abs(by2 - by1);
        int commonArea = 0;

        if (xleftCommonArea < xRightCommonArea && ybottomCommonArea < ytopCommonArea) {

            int xDiff = Math.abs(xRightCommonArea - xleftCommonArea);
            int yDiff = Math.abs(ytopCommonArea - ybottomCommonArea);
            commonArea = xDiff * yDiff;

        }

        return aRecArea + bRecArea - commonArea;

    }
}