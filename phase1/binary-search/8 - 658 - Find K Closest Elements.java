// 658 - Find K Closest Elements

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    int start = 0, end = arr.length - k;

    while (start < end) {
        int mid = start + (end - start) / 2;
        if (x - arr[mid] > arr[mid + k] - x) {
            start = mid + 1;
        }
        else {
            end = mid;
        }
    }

    List<Integer> res = new LinkedList<>();

    for (int i = start; i < start + k; i++) {
        res.add(arr[i]);
    }

    return res;
    }
}

/**
k = 2
x = 6
1234567
    s
    e
   m
 */

 /**
 start = mid + 1 because mid can be start for only two elements resulting in an infinite loop
  */
