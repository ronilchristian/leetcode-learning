class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        // sort array
        Arrays.sort(nums);

        int counter = 0, n = nums.length;

        // iterate over array
        for (int i = 0; i < n; i++) {
            int start = i + 1, end = n - 1;

            while (start < end) {
                int curSum = nums[i] + nums[start] + nums[end];

                if (curSum < target) {
                    counter += end - start;
                    start++;
                }
                else {
                    end--;
                }
            }
        }

        // return res
        return counter;
    }
}