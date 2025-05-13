// 1 - 167 - Two Sum II - Input Array Is Sorted

    class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // define pointers
        int n = numbers.length;
        int start = 0, end = n - 1;

        // iterate
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                return new int[] {start + 1, end +1};
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return new int[] {-1, -1};
    }
}
