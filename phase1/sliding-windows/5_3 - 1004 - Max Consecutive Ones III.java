// 5_3 - 1004 - Max Consecutive Ones III

class Solution {
    public int longestOnes(int[] nums, int k) {
        // base case
        int n = nums.length;
        if ( n < 2 && k != 0 ) return n;

        // define pointers
        int start = 0, end = 0;
        int maxLen = 0, count = 0;

        // siding window
        while ( end < n ) {
            if (nums[end] == 0)
                count++;

            while ( count > k ) {
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
