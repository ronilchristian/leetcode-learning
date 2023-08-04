class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // sort array
        Arrays.sort(nums);

        int n = nums.length;
        int closest = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;

        // iterate over array
        for (int i = 0; i < n; i++) {
            int start = i + 1;
            int end = n - 1;

            while (start < end) {
                int curSum = nums[i] + nums[start] + nums[end];

                if (curSum == target) return target;
                else if (curSum < target) start++;
                else end--;

                int curDif = Math.abs(curSum - target);

                if (minDiff > curDif) {
                    minDiff = curDif;
                    closest = curSum;
                }
            }
        }

        // return res
        return closest;
    }
}