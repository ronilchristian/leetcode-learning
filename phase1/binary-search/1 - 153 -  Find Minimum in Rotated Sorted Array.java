// 153 -  Find Minimum in Rotated Sorted Array

class Solution {
    public int findMin(int[] nums) {
        // define pointers
        int start = 0, end = nums.length - 1;
        if (nums[start] < nums[end]) return nums[start];

        // binary search
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end])
                start = mid;
            else
                end = mid;
        }

        return Math.min(nums[start], nums[end]);
    }
}
