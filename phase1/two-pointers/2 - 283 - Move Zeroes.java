// 2 - 283 - Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        // base case
        int n = nums.length;
        if (n < 2) return;

        // define pointers
        int L = 0, R = 0;

        // iterate
        while (R < n) {
            if ( nums[R] != 0 ) {
                nums[L] = nums[R];
                L++;
            }
            R++;
        }

        // set zero
        while ( L < n ) {
            nums[L] = 0;
            L++;
        }
    }
}
