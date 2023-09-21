// Sort Colors

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int cur = 0, start = 0, end = n - 1;

        while (cur <= end) {
            if (nums[cur] == 2) {
                swap(nums, cur, end);
                end--;
            }
            else if (nums[cur] == 1) {
                cur++;
            }
            else {
                swap(nums, cur, start);
                start++;
                cur++;
            }
        }
    }

    public void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}