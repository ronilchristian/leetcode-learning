// 3_2 - 80 - Remove Duplicates from Sorted Array II

class Solution {
    public int removeDuplicates(int[] nums) {
        // base case
        int n = nums.length;
        if (n < 3) return n;

        // define pointers
        int start = 0, end = 1;
        int count = 0;

        // iterate
        while (end < n) {
            if (nums[start] != nums[end]) {
                start++;
                nums[start] = nums[end];
                count = 0;
            } else if (nums[start] == nums[end] && count < 1) {
                count++;
                start++;
                nums[start] = nums[end];
            }
            end++;
        }

        return start + 1;
    }
}
