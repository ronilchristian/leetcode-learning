// 6_1 - 15 - 3Sum

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // base case
        List<List<Integer>> res = new LinkedList<>();
        int n = nums.length;
        if (n < 3) return res;

        // sort the array
        Arrays.sort(nums);

        // iterate
        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i-1]) continue;

            int start = i + 1, end = n - 1;
            while (start < end) {
                int curSum = nums[i] + nums[start] + nums[end];

                if (curSum == 0) {
                    List<Integer> sub = new LinkedList<>();
                    sub.add(nums[i]);
                    sub.add(nums[start]);
                    sub.add(nums[end]);
                    res.add(sub);

                    start++;
                    end--;

                    while (start < end && nums[start] == nums[start - 1]) start++;
                    while (start < end && nums[end] == nums[end + 1]) end--;
                }
                else if (curSum < 0) start++;
                else end--;
            }
        }

        return res;
    }
}
