// 5_2 - 487 - Max Consecutive Ones II

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // base case
        int n = nums.length;
        if ( n < 2 ) return n;

        // define pointers
        int start = 0, end = 0;
        int maxLen = 0, count = 0;

        // siding window
        while ( end < n ) {
            if (nums[end] == 0)
                count++;

            while ( count > 1 ) {
                if ( nums[start] == 0 )
                    count--;
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }

        return maxLen;
    }
}
