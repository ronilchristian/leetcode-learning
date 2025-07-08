// 7 - 763 - Partition Labels

class Solution {
    public List<Integer> partitionLabels(String s) {
        char[] arr = s.toCharArray();
        int[] cache = new int[128];
        
        for (int i = 0; i < arr.length; i++) {
            char cur = arr[i];
            cache[cur] = i;
        }

        int start = 0, end = 0, index = 0;
        List<Integer> res = new LinkedList<>();

        while (index < arr.length) {
            end = Math.max(end, cache[arr[index]]);
            if (end == index) {
                int size = end - start + 1;
                res.add(size);
                end++;
                start = end;
            }
            index++;
        }

        return res;
    }
}
