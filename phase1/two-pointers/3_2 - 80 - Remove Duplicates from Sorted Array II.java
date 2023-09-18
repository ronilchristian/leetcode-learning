// 80. Remove Duplicates from Sorted Array II

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0, j = 1;
        int count = 0;

        while (j < n) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
                count = 0;
            } else if (nums[i] == nums[j] && count < 1) {
                    nums[++i] = nums[j];
                    count++;
            }
            j++;
        }

        return i+1;
    }
}
