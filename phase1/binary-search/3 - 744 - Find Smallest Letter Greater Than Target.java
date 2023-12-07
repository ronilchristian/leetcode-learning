// 744 -  Find Smallest Letter Greater Than Target

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        if (target < letters[start] || letters[end] <= target)
            return letters[0];

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid;
            }
            else {
                end = mid;
            }
        }

        return letters[end];
    }
}
