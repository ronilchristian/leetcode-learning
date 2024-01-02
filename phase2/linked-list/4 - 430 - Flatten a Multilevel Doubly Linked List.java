// 430 - Flatten a Multilevel Doubly Linked List

/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }

    private Node dfs(Node node) {
        Node pre = null;

        while (node != null) {
            pre = node;
            if (node.child != null) {
                // change the tail node
                Node tail = dfs(node.child);
                tail.next = node.next;
                if (node.next != null) node.next.prev = tail;

                // change the head node
                node.next = node.child;
                node.child.prev = node;
                node.child = null;

                // reset the pointers
                node = tail.next;
                pre = tail;
            }
            else {
                node = node.next;
            }
        }

        return pre;
    }
}

/**
my solution (0 ms)

class Solution {
    public Node flatten(Node head) {
        // base case
        if (head == null) return head;

        // defining pointers
        Node cur = head;

        while (cur != null) {
            if (cur.child != null) {
                Node temp = cur.next, p = cur.child;

                cur.next = p;
                p.prev = cur;
                
                while (p.next != null) p = p.next;

                p.next = temp;
                if (temp != null) temp.prev = p;

                cur.child = null;
            }
            cur = cur.next;
        }

        return head;
    }
}

 */

