// 34 Find First and Last Position of Element in Sorted Array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        // defining pointers
        int n = nums.length;
        int start = 0, end = n-1;
        int[] res = new int[] {-1,-1};

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                while (start < mid && nums[mid-1] == nums[mid]) mid--;
                start = mid;
                while (mid < end && nums[mid] == nums[mid+1]) mid++;
                end = mid;

                res[0] = start;
                res[1] = end;
                return res;
            }
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        
        return res;
    }
}

/**
5 7 7 8 8 10
      s
        e
        m
 */
