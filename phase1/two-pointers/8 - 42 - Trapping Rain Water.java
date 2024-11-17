// 8 - 42 - Trapping Rain Water

class Solution {
    public int trap(int[] height) {
        // base case
        int n = height.length;
        if ( n < 3 ) return 0;

        int max = 0;
        for ( int i = 0; i < n; i++ ) {
            if ( height[max] < height[i] )
                max = i;
        }

        int sum = 0;
        int leftMax = 0;
        for ( int i = 0; i < max; i++ ) {
            if ( height[leftMax] < height[i] )
                leftMax = i;
            sum += Math.min(height[leftMax], height[max]) - height[i];
        }

        int rightMax = n - 1;
        for ( int i = n - 1; i >= max; i-- ) {
            if ( height[rightMax] < height[i] )
                rightMax = i;
            sum += Math.min(height[rightMax], height[max]) - height[i];
        }

        return sum;
    }
}

/*
class Solution {
    public int trap(int[] height) {
        // dynamic programming approach
        // base case
        int n = height.length;
        if ( n < 3 ) return 0;

        // memoising max values from left
        int[] left = new int[n];
        for ( int i = 0; i < n; i++ ) {
            left[i] = i == 0 ? height[i] : Math.max(height[i], left[i-1]);
        }

        // memoising max values from right
        int[] right = new int[n];
        for ( int i = n - 1; i >= 0; i-- ) {
            right[i] = i == n - 1 ? height[i] : Math.max(height[i], right[i+1]);
        }

        // calculating sum
        int sum = 0;
        for ( int i = 0; i < n; i++ ) {
            sum += Math.min(left[i], right[i]) - height[i];
        }

        return sum;
    }
}
*/
