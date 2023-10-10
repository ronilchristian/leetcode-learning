// 340 - Longest Substring with At Most K Distinct Characters

import java.util.*;

class Solution {
    public int lengthOfLongestSubstringAtMostKDistinct(String s, int k) {
        // base case
        if (k == 0) return 0;
        
        char[] arr = s.toCharArray();
        int n = arr.length;

        int start = 0, end = 0;
        int maxLen = 0;
        Map<Character, Integer> hm = new HashMap<>();

        while (end < n) {
            hm.put(arr[end], hm.getOrDefault(arr[end], 0) + 1);

            while (hm.size() > k) {
                hm.put(arr[start], hm.get(arr[start]) - 1);
                if (hm.get(arr[start]) == 0)
                    hm.remove(arr[start]);
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }

        return maxLen;
    }
}
