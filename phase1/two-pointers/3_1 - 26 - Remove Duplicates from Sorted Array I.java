// 26. Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0, j = 1;
        
        while (j < n) {
            if (nums[j] != nums[i]) 
                nums[++i] = nums[j];
            j++;
        }
        
        return i+1;
    }
}
