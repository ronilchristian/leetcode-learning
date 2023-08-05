class Solution {
    public List<Integer> partitionLabels(String s) {
        char[] arr = s.toCharArray();
        int[] cache = new int[128];
        for (int i = 0; i < arr.length; i++) {
            char curr = arr[i];
            System.out.println(curr);
            cache[curr] = i;
        }
        List<Integer> res = new LinkedList<>();
        int start = 0, end = 0, index = 0;
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