// 9 - 75 - Sort Colors

class Solution {
    public void sortColors(int[] nums) {
        // base case
        int n = nums.length;
        if ( n < 2 ) return;

        // define pointers
        int start = 0, end = n - 1, cur = 0;

        // iterate
        while (cur <= end) {
            if ( nums[cur] == 2) {
                swap(nums, cur, end);
                end--;
            } else if ( nums[cur] == 1) {
                cur++;
            } else {
                swap(nums, start, cur);
                start++;
                cur++;
            }
        }
    }

    private void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}
