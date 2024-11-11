// 6_2 - 16 - 3Sum Closest

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // sort the array
        Arrays.sort(nums);

        // define pointers
        int n = nums.length;
        int closest = 0, minDif = Integer.MAX_VALUE;

        // iterate
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1, end = n - 1;

            while (start < end) {
                int curSum = nums[i] + nums[start] + nums[end];

                if (curSum == target) return target;
                else if (curSum < target) start++;
                else end--;

                int curDif = Math.abs(curSum - target);
                if (curDif < minDif) {
                    minDif = curDif;
                    closest = curSum;
                }
            }
        }

        return closest;
    }
}
