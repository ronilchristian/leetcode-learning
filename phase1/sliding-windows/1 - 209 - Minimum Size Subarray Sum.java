// 1 - 209 - Minimum Size Subarray Sum

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // define pointers
        int n = nums.length;
        int start = 0, end = 0;
        int min = Integer.MAX_VALUE, sum = 0;

        // sliding window
        while ( end < n ) {
            sum += nums[end];

            // contract
            while ( sum >= target ) {
                min = Math.min(min, end - start + 1);
                sum -= nums[start];
                start++;
            }

            end++;
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
