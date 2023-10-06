// 3. Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // base case
        char[] arr = s.toCharArray();
        int n = arr.length;
        if (n < 2) return n;

        // defining pointers
        int start = 0, end = 0;
        int maxLen = 0;
        Map<Character, Integer> hm = new HashMap<>();

        // traversing the array
        while (end < n) {
            // adding to the map
            hm.put(arr[end], hm.getOrDefault(arr[end], 0) + 1);

            // contract the window if the condition doesn't satisfy
            while (hm.size() != end - start + 1) {
                hm.put(arr[start], hm.get(arr[start]) - 1);
                // if element value is zero, then remove
                if (hm.get(arr[start]) == 0)
                    hm.remove(arr[start]);
                start++;
            }

            // storing maxLen value
            maxLen = Math.max(maxLen, end - start + 1);

            // increment right pointer
            end++;
        }

        // returning max length
        return maxLen;
    }
}