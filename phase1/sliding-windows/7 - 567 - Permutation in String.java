// 567 - Permutation in String

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[128];
        char[] s1_arr = s1.toCharArray();
        char[] s2_arr = s2.toCharArray();

        int start = 0, end = 0;
        int minLen = Integer.MAX_VALUE;
        int count = 0; // matching character count

        for (char cur: s1_arr) {
            arr[cur]++;
        }

        while (end < s2_arr.length) {
            char cur = s2_arr[end];
            // increment counter when value found in table
            if (--arr[cur] >= 0)
                count++;
            
            while (count == s1.length()) {
                minLen = Math.min(minLen, end - start + 1);

                char leftChar = s2_arr[start];
                // decrement counter if value found in table
                if (++arr[leftChar] > 0)
                    count--;
                start++;
            }
            end++;
        }

        return minLen == s1.length();
    }
}
