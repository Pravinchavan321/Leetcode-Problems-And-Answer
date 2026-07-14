class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;

        int n = height.length;
        int i = 0;
        int j = n - 1;

        while (i != j) {
            maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }

        }

        return maxArea;
    }
}