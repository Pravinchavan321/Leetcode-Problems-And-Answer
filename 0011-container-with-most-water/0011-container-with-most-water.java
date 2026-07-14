class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;

        int n = height.length;
        int i = 0;
        int j = n - 1;

        while (i != j) {

            if (height[i] < height[j]) {
                maxArea = Math.max(maxArea, (j - i) * height[i]);
                i++;
            } else {
                maxArea = Math.max(maxArea, (j - i) * height[j]);
                j--;
            }

        }

        return maxArea;
    }
}