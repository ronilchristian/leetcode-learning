// Partition Labels

class Solution {
    public List<Integer> partitionLabels(String s) {
        char[] arr = s.toCharArray();
        int[] cache = new int[128];
        // storing last occurrences of each character
        for (int i = 0; i < arr.length; i++) {
            char curr = arr[i];
            cache[curr] = i;
        }
        List<Integer> res = new LinkedList<>();
        int start = 0, end = 0, index = 0;
        // partitioning string when index matches the
        // max last occurrence of a character
        while (index < arr.length) {
            end = Math.max(end, cache[arr[index]]);
            if (end == index) {
                res.add(end - start + 1);
                end++;
                start = end;
            }
            index++;
        }

        return res;
    }
}