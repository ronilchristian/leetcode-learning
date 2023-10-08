// 485. Max Consecutive Ones I

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0, maxLen = 0;

        for (int i = 0; i < n; i++) {
            if(nums[i] != 1) {
                count = 0;
            }
            else {
                count++;
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }
}
