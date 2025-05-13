// 3_1 - 26 - Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        // base case
        int n = nums.length;
        if (n < 2) return n;

        // define pointers
        int start = 0, end = 1;

        // iterate
        while (end < n) {
            if (nums[start] != nums[end]) {
                start++;
                nums[start] = nums[end];
            }
            end++;
        }

        return start + 1;
    }
}
