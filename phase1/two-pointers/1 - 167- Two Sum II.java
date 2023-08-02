// 167. Two Sum II - Input Array Is Sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0, j = numbers.length-1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) 
                return new int[] {i+1, j+1};
            else if (sum < target)
                i++;
            else
                j--;
        }

        return new int[] {-1, -1};
    }
}
