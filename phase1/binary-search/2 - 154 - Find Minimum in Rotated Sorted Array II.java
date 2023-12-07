// 154 -  Find Minimum in Rotated Sorted Array II

class Solution {
    public int findMin(int[] nums) {
        // define pointers
        int start = 0, end = nums.length - 1;

        // binary search
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end])
                start++;
            else
                end--;
        }

        return Math.min(nums[start], nums[end]);
    }
}

/**
duplicates will affect the time complexity
for an average case it will be O(log n) for binary search
for the worst case when all elements are the same it will be O(n) since it will check all the elements
 */
