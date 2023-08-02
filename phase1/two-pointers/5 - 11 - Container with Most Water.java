class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = Integer.MIN_VALUE;

        while (start < end) {
            int h = Math.min(height[start], height[end]);
            maxArea = Math.max(maxArea, h * (end - start));

            while (start < end && height[start] <= h) {
                start++;
            }
            
            while (start < end && height[end] <= h) {
                end--;
            }
        }
        
        return maxArea;
    }
}