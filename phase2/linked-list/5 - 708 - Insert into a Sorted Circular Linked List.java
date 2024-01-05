// 708 - Insert into a Sorted Circular Linked List

class Solution {
    public Node insert(Node head, int insertVal) {
        Node node = new Node(insertVal);

        if (head == null) {
            node.next = node;
            return node;
        }

        Node cur = head;

        while (cur.next != head) {
            if (cur.val <= insertVal && insertVal <= cur.next.val) break;
            else if (cur.val > cur.next.val) {
                if (cur.val <= insertVal && cur.next.val <= insertVal) break;
                if (cur.val >= insertVal && cur.next.val >= insertVal) break;
            }
        }

        Node temp = cur.next;
        cur.next = node;
        node.next = temp;

        return head;
    }
}
