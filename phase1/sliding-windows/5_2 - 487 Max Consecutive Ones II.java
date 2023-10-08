// 485. Max Consecutive Ones II

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int start = 0, end = 0;
        int count = 0, maxLen = 0;

        while (end < n) {
            if (nums[end] == 0)
                count++;

            while (count > 1) {
                if (nums[start] == 0)
                    count--;
                start++;
        }

        maxLen = Math.max(maxLen, end - start + 1);

        end++;
       }

        return maxLen;
    }
}
