// 5_1 - 485 - Max Consecutive Ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxLen = 0;

        for (int num : nums) {
            if ( num == 0 ) {
                count = 0;
            } else {
                count++;
                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }
}
