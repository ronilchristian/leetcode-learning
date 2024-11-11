// 3_2 - 80 - Remove Duplicates from Sorted Array II

class Solution {
    public int removeDuplicates(int[] nums) {
        // base case
        int n = nums.length;
        if (n < 3) return n;

        // define pointers and counter
        int L = 0, R = 1, count = 0;

        // iterate
        while (R < n) {
            if (nums[L] != nums[R]) {
                L++;
                nums[L] = nums[R];
                count = 0;
            }
            else if (nums[L] == nums[R] && count < 1) {
                L++;
                nums[L] = nums[R];
                count++;
            }
            R++;
        }

        return L + 1;
    }
}
