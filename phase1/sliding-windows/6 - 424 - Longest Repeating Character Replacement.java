// 424 - Longest Repeating Character Replacement

class Solution {
    public int characterReplacement(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int start = 0, end = 0;
        int maxLen = 0, mostFreq = 0;
        Map<Character, Integer> hm = new HashMap<>();

        // find longest repeating character
        while (end < n) {
            // expand the window and update the most frequent character value
            hm.put(arr[end], hm.getOrDefault(arr[end], 0) + 1);
            mostFreq = Math.max(mostFreq, hm.get(arr[end]));

            // shrink the window if we need to replace more than k characters
            while ((end - start + 1) - mostFreq > k) {
                hm.put(arr[start], hm.get(arr[start]) - 1);
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }

        return maxLen;
    }
}

/**
AABCDAAA
    ^
       ^

k = 1
 */