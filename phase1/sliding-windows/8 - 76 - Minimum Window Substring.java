// 76 - Minimum Window Substring

class Solution {
    public String minWindow(String s, String t) {
        // define table
        int[] arr = new int[128];

        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();

        int start = 0, end = 0;
        int minLen = Integer.MAX_VALUE;
        int count = 0;
        String res = "";

        for (char cur: t_arr) 
            arr[cur]++;

        while (end < s_arr.length) {
            char cur = s_arr[end];
            if (--arr[cur] >= 0)
                count++;

            while (count == t_arr.length) {
                if (minLen > (end - start + 1)) {
                    minLen = end - start + 1;
                    res = s.substring(start, end + 1);
                }
                char leftChar = s_arr[start];
                if (++arr[leftChar] > 0)
                    count--;
                start++;
            }
            end++;
        }

        return res;
    }
}
