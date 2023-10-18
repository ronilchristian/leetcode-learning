// 142 - Linked List Cycle II

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // base case
        if (head == null || head.next == null) return null;

        // define pointers
        ListNode slow = head, fast = head;

        // iterate
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                // find cycle length
                int len = findLen(slow);
                // return head of cycle
                return findHead(len, head);
            }
        }

        return null;
    }

    private int findLen(ListNode node) {
        ListNode temp = node.next;
        int len = 1;
        while (temp != node) {
            temp = temp.next;
            len++;
        }
        return len;
    }

    private ListNode findHead(int len, ListNode head) {
        ListNode p1 = head, p2 = head;

        for (int i = 0; i < len; i++) {
            p2 = p2.next;
        }

        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }
}
