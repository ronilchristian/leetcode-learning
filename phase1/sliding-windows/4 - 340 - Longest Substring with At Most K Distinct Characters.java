// 4 - 340 - Longest Substring with At Most K Distinct Characters

class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // base case
        if ( k == 0 ) return 0;
        char[] arr = s.toCharArray();
        int n = arr.length;
        if ( n < 2 ) return n;

        // define pointers
        int start = 0, end = 0;
        int maxLen = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        // sliding window
        while ( end < n ) {
            hm.put(arr[end], hm.getOrDefault(arr[end], 0) + 1);

            while ( hm.size() > k ) {
                hm.put(arr[start], hm.get(arr[start]) - 1);
                if ( hm.get(arr[start]) == 0)
                    hm.remove(arr[start]);
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
            end++
        }

        return maxLen;
    }
}
