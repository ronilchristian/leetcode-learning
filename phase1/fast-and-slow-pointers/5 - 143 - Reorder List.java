// 143 - Reorder List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        // base case
        if (head == null || head.next == null) return;

        // defining pointers
        ListNode slow = head, fast = head, pre = null;

        // getting middle of the list
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // break the list at the middle
        pre.next = null;

        // reoder the list
        ListNode p1 = head, p2 = reverse(slow);

        // combine the lists to get result
        while (p1 != null && p2 != null) {
            ListNode nex1 = p1.next, nex2 = p2.next;

            p1.next = p2;
            p2.next = nex1 == null ? nex2 : nex1;

            p1 = nex1;
            p2 = nex2;
        }
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode pre = null, cur = head;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        
        return pre;
    }
}

/**
- divide the list in two list at the middle element
- reverse the second half of the original list
- combine the two list using two pointers
 */
