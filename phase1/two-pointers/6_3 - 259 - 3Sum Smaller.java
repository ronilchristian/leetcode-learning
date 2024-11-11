// 6_3 - 259 - 3Sum Smaller

class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        // base case
        int n = nums.length;
        if (n < 3) return 0;

        // sort the array
        Arrays.sort(nums);

        // define pointers
        int count = 0;

        // iterate
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1, end = n - 1;

            while (start < end) {
                int curSum = nums[i] + nums[start] + nums[end];

                if (curSum < target) {
                    count += end - start;
                    start++;
                }
                else end--;
            }
        }

        return count;
    }
}
