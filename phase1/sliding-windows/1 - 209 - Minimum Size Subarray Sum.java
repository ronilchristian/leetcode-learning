// 209 - Minimum Size Subarray Sum


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;

        while (end < n) {
            sum += nums[end];
            while (sum >= target) {
                min = Math.min(min, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}