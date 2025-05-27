// 5 - 11 - Container With Most Water

class Solution {
    public int maxArea(int[] height) {
        // define pointers
        int n = height.length;
        int start = 0, end = n - 1, maxArea = Integer.MIN_VALUE;

        // iterate
        while (start < end) {
            int h = Math.min(height[start], height[end]);
            maxArea = Math.max(maxArea, (end - start) * h);

            while (start < end && height[start] <= h) start++;
            while (start < end && height[end] <= h) end--;
        }

        return maxArea;
    }
}
