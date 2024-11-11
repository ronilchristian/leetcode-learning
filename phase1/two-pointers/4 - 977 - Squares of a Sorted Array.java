// 4 - 977 - Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] nums) {
        // define pointers
        int n = nums.length;
        int start = 0, end = n - 1, index = n - 1;

        // define res array
        int[] res = new int[n];

        // iterate
        while (0 <= index) {
            int left = nums[start] * nums[start];
            int right = nums[end] * nums[end];

            if (left < right) {
                res[index--] = right;
                end--;
            } else {
                res[index--] = left;
                start++;
            }
        }

        return res;
    }
}
