// 234 -  Palindrome Linked List

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
    public boolean isPalindrome(ListNode head) {
        // base case
        if (head == null || head.next == null) return true;

        // defining pointers
        ListNode slow = head, fast = head;

        // traversing the list
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // comparing
        ListNode start = head, end = reverse(slow);
        
        while (end != null) {
            if (start.val == end.val) {
                start = start.next;
                end = end.next;
            }
            else return false;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {
        if (head.next == null) return head;

        ListNode prev = null, cur = head;

        // reversing
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }
}
