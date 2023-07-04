// 977. Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] res = new int[nums.length];
        int n = nums.length - 1;
        
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            if (Math.abs(nums[start]) >= Math.abs(nums[end]))
                res[n--] = nums[start] * nums[start++];
            else
                res[n--] = nums[end] * nums[end--];
        }
        
        return res;
    }
}
