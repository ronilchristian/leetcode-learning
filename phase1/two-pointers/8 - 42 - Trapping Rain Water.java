//  Trapping Rain Water

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int max = 0;
        int sum = 0;

        // getting the max elevation index
        for (int i = 0; i < n; i++) {
            if (height[max] < height[i])
                max = i;
        }

        // sum from the left max index to max elevation index
        int leftMax = 0;
        for (int i = 0; i < max; i++) {
            if (height[leftMax] < height[i])
                leftMax = i;
            sum += Math.min(height[leftMax], height[max]) - height[i];
        }

        // sum from the right max index to max elevation index
        int rightMax = n - 1;
        for (int i = n - 1; i > max; i--) {
            if (height[rightMax] < height[i])
                rightMax = i;
            sum += Math.min(height[rightMax], height[max]) - height[i];
        }

        return sum;
    }
}

/*
// using dynamic programming
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        // keeping track of left max value
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            left[i] = i == 0 ? height[i] : Math.max(left[i-1], height[i]);
        }

        // keeping track of right max value
        int[] right = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            right[i] = i == n - 1 ? height[i] : Math.max(height[i], right[i+1]);
        }

        // calculating difference between min from left max and right max
        // and current value
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.min(left[i], right[i]) - height[i];
        }

        return sum;
    }
}
*/