// 2 - 159 - Longest Substring with At Most Two Distinct Characters

class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        // base case
        char[] arr = s.toCharArray();
        int n = s.length();
        if ( n < 3 ) return n;

        // define pointers
        int start = 0, end = 0;
        int max = 0;

        Map<Character, Integer> hm = new HashMap<>();

        // sliding window
        while ( end < n ) {
            hm.put(arr[end], hm.getOrDefault(arr[end], 0), + 1);

            while ( hm.size() > 2 ) {
                hm.put(arr[start], hm.get(arr[start]) - 1);
                if ( hm.get(arr[start]) == 0) {
                    hm.remove(arr[start]);
                }
                start++;
            }

            max = Math.max(max, end - start + 1);
            end++;
        }

        return max;
    }
}
